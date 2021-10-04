package com.example.task221.projection;

import com.example.task221.entity.User;
import com.example.task221.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(types = User.class)
public interface CustomUser {
    Integer getId();
    String getFirstName();
    String getLastName();
    Integer getPhoneNumber();
    String getCode();
    Set<Warehouse> getWarehouseList();

}
