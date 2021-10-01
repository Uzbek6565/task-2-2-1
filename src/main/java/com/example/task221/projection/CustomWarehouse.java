package com.example.task221.projection;

import com.example.task221.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {
    Integer getId();
    String getName();

}
