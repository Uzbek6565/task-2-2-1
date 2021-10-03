package com.example.task221.projection;

import com.example.task221.entity.Input;
import com.example.task221.entity.InputProduct;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProject {
    Integer getId();
    Double getAmount();
    Double getPrice();
    Date getExpireDAte();
    Input getInput();
}
