package com.kuang.mapper;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author ：ltb
 * @date ：2020/7/8
 */
public interface UserMapper {

    /**
     * @param
     * @return
     */
    List<User> getUserByLimit(Map map);

}
