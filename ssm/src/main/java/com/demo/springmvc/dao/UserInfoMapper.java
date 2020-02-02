package com.demo.springmvc.dao;

import com.demo.springmvc.model.UserInfo;

import java.util.List;

/**
 * @author whh
 * @date 2020/2/2 - 23:31
 */
public interface UserInfoMapper {
    //删除一个学生
    int deleteByPrimaryKey(Integer id);
    //增加一个学生
    int insert(UserInfo record);

    int insertSelective(UserInfo record);
    //查询一个学生
    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);
    //更新一个学生
    int updateByPrimaryKey(UserInfo record);

    List<UserInfo> selectAll();

}
