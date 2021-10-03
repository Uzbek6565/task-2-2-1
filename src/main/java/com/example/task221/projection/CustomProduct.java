package com.example.task221.projection;

import com.example.task221.entity.Attachment;
import com.example.task221.entity.Category;
import com.example.task221.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();
    String getName();
    Category getCategory();
    Attachment getAttachment();
    String getCode();
    Integer getMeasurement();

}
