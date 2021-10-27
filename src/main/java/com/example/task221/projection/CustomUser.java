package com.example.task221.projection;

import com.example.task221.entity.User;
import com.example.task221.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = User.class, name = "noPassword")
public interface CustomUser {
    Integer getId();
    String getFirstName();
    String getLastName();
    Integer getPhoneNumber();
    String getCode();
    Integer getWarehouseList();
}
