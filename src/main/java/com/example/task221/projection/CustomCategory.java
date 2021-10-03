package com.example.task221.projection;

import com.example.task221.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();
    String getName();
    Category getParentCategory();
    boolean getActive();
}
