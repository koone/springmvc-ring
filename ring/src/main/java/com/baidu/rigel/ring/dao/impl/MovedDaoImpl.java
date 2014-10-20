package com.baidu.rigel.ring.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baidu.rigel.ring.bo.Moved;
import com.baidu.rigel.ring.dao.MovedDao;
import com.baidu.rigel.ring.dao.mapper.MovedMapper;
import com.baidu.rigel.ring.vo.MovedInfoVo;

@Repository("movedDao")
public class MovedDaoImpl implements MovedDao {

	@Autowired
	public MovedMapper movedMapper;
	
	@Override
	public void saveMoved(Moved moved) {
		movedMapper.insert(moved);
	}

	@Override
	public List<MovedInfoVo> findCloserMovedUser(Map<String, Object> local) {
		return movedMapper.findCloserMovedUser(local);
	}
	
	
		
}
