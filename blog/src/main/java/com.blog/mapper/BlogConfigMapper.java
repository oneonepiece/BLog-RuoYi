package com.blog.mapper;



import com.blog.entity.BlogConfig;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BlogConfigMapper {
    List<BlogConfig> selectAll();

    BlogConfig selectByPrimaryKey(String configName);

    int updateByPrimaryKeySelective(BlogConfig record);

}