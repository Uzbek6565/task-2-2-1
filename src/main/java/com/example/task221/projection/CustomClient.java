package com.example.task221.projection;

import com.example.task221.entity.Client;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Client.class)
public interface CustomClient {
    Integer getId();
    String getName();
    Integer getPhoneNumber();
}
