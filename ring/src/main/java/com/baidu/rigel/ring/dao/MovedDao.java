package com.baidu.rigel.ring.dao;

import java.util.List;
import java.util.Map;

import com.baidu.rigel.ring.bo.Moved;
import com.baidu.rigel.ring.vo.MovedInfoVo;

public interface MovedDao {
	
	public void saveMoved(Moved moved);
	
	/**
	 * 根据当前位置查询一定时间，一定区域范围内心动者
	 * @param local
	 * @return
	 */
	public List<MovedInfoVo> findCloserMovedUser(Map<String,Object> local);
}
