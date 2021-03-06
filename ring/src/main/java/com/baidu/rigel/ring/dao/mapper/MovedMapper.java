package com.baidu.rigel.ring.dao.mapper;

import java.util.List;
import java.util.Map;

import com.baidu.rigel.ring.bo.Moved;
import com.baidu.rigel.ring.vo.MovedInfoVo;

public interface MovedMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_moved
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_moved
     *
     * @mbggenerated
     */
    int insert(Moved record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_moved
     *
     * @mbggenerated
     */
    int insertSelective(Moved record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_moved
     *
     * @mbggenerated
     */
    Moved selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_moved
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Moved record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_moved
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Moved record);

	List<MovedInfoVo> findCloserMovedUser(Map<String, Object> local);
}