package com.kuang.mapper;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author ：ltb
 * @date ：2020/7/8
 */
public interface UserMapper {


    @Select("select * from user")
    List<User> getAllUsers();

}
