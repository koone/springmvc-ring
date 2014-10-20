package com.baidu.rigel.ring.service;

import java.util.List;

import com.baidu.rigel.ring.bo.Moved;
import com.baidu.rigel.ring.dto.MovedInfoDto;

public interface MovedService {
	
	public void saveMoved(Moved moved);
	
	public List<MovedInfoDto> findCloserMovedUser(Long userId,float localX,float localY);
}
