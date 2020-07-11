package com.kuang.mapper;

import com.kuang.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author ：ltb
 * @date ：2020/7/11
 */
public interface BlogMapper {

    Integer addBlog(Blog blog);
    List<Blog> queryBlogIf(Map map);
    List<Blog> queryBlogChoose(Map map);
    Integer updateBlog(Map map);
    List<Blog> queryBlogSql(Map map);
    List<Blog> queryBlogForEach(Map map);

}
