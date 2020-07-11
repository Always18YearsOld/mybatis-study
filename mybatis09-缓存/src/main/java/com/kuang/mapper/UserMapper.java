package com.kuang.mapper;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author ：ltb
 * @date ：2020/7/11
 */
public interface UserMapper {

    User queryUserById(@Param("id") Integer id);

    Integer updateUserById(Map map);
}
