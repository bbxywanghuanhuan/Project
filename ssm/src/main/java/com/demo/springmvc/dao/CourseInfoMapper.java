package com.demo.springmvc.dao;

import com.demo.springmvc.model.CourseInfo;

/**
 * @author whh
 * @date 2020/2/2 - 23:31
 */
public interface CourseInfoMapper {
    //删除一门课程
    int deleteByPrimaryKey(Integer id);
    //增加一门课程
    int insert(CourseInfo record);

    int insertSelective(CourseInfo record);
    //查询一门课程
    CourseInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseInfo record);
    //更行一门课程
    int updateByPrimaryKey(CourseInfo record);

}
