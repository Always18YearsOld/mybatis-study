package com.kuang.mapper;

import com.kuang.pojo.User;

import java.util.List;

/**
 * @author ：ltb
 * @date ：2020/7/8
 */
public interface UserMapper {

    /**
     * 查询所有用户
     * @return
     */
    List<User> getUserList();


    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * 插入一个用户
     */
    Integer addUser(User user);

    /**
     * 修改用户
     */
    Integer updateUser(User user);

    /**
     * 删除用户
     */
    Integer deleteUser(Integer id);
}
