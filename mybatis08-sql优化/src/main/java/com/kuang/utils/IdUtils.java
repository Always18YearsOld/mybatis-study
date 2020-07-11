package com.kuang.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @author ：ltb
 * @date ：2020/7/11
 */
public class IdUtils {

    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    @Test
    public void test(){
        System.out.println(IdUtils.getId());
    }
}
