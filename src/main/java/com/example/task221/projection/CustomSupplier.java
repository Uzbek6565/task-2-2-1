package com.example.task221.projection;

import com.example.task221.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();
    String getName();
    Integer getPhoneNumber();
}
