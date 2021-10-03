package com.example.task221.projection;

import com.example.task221.entity.OutputProduct;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OutputProduct.class)
public interface CustomOutputProjection {
    Integer getId();
    Double getAmount();
    Double getPrice();
    Integer getOutput();
}
