package com.baidu.rigel.ring.service.Impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.baidu.rigel.ring.bo.Moved;
import com.baidu.rigel.ring.config.RingConfig;
import com.baidu.rigel.ring.dao.MovedDao;
import com.baidu.rigel.ring.dto.MovedInfoDto;
import com.baidu.rigel.ring.service.MovedService;
import com.baidu.rigel.ring.utils.DateTimeUtils;
import com.baidu.rigel.ring.vo.MovedInfoVo;

@Service("movedService")
public class MovedServiceImpl implements MovedService {
	
	@Resource(name="movedDao")
	public MovedDao movedDao;

	@Override
	public void saveMoved(Moved moved) {
		movedDao.saveMoved(moved);
	}

	@Override
	public List<MovedInfoDto> findCloserMovedUser(Long userId, float localX,
			float localY) {
		Map paraMap = new HashMap<String,Object>(5);
		paraMap.put("userId", userId);
		paraMap.put("movedTimeMin", DateTimeUtils.calculate(new Date(), -RingConfig.configCache.get("time")));
		paraMap.put("movedTimeMax", DateTimeUtils.calculate(new Date(), RingConfig.configCache.get("time")));
		paraMap.put("movedPlaceXMin", localX-RingConfig.configCache.get("distance"));
		paraMap.put("movedPlaceXMax", localX+RingConfig.configCache.get("distance"));
		paraMap.put("movedPlaceYMin", localY-RingConfig.configCache.get("distance"));
		paraMap.put("movedPlaceYMax", localY+RingConfig.configCache.get("distance"));
		List<MovedInfoVo> infoVoList = movedDao.findCloserMovedUser(paraMap);
		//封装成前端对象
		List<MovedInfoDto> result = new ArrayList<MovedInfoDto>();
		for(MovedInfoVo infoVo : infoVoList){
			MovedInfoDto infoDto = new MovedInfoDto(infoVo);
			result.add(infoDto);
		}
		return result;
	}
	

}