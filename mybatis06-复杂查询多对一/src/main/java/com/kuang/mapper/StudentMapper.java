package com.kuang.mapper;

import com.kuang.pojo.Student;

import java.util.List;

/**
 * @author ：ltb
 * @date ：2020/7/9
 */
public interface StudentMapper {

    //下面两个是多对一的处理

    List<Student> getStudent();


    List<Student> getStudent2();

}
