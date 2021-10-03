package com.example.task221.projection;

import com.example.task221.entity.Currency;
import com.example.task221.entity.Input;
import com.example.task221.entity.Supplier;
import com.example.task221.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();
    Date getDate();
    Warehouse getWarehouse();
    Supplier getSupplier();
    Currency getCurrency();
    String getFactureNumber();
    String getCode();
}
