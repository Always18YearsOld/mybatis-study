package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author ：ltb
 * @date ：2020/7/11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {

    private String id;
    private String title;
    private String author;
    private Date createTime;
    private Integer views;
}
