package com.demo.springmvc.dao;

import com.demo.springmvc.model.CourseUserInfo;

/**
 * @author whh
 * @date 2020/2/2 - 23:31
 */
public interface CourseUserInfoMapper {
    //删除一个课程学生
    int deleteByPrimaryKey(Integer id);
    //增加一个课程学生
    int insert(CourseUserInfo record);

    int insertSelective(CourseUserInfo record);
    //查询一个课程学生
    CourseUserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseUserInfo record);
    //更新一个课程学生
    int updateByPrimaryKey(CourseUserInfo record);

}
