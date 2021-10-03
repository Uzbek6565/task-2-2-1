package com.example.task221.projection;

import com.example.task221.entity.Client;
import com.example.task221.entity.Currency;
import com.example.task221.entity.Output;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();
    Timestamp getDate();
    Integer getWarehouse();
    Currency getCurrency();
    String getFactureNumber();
    String getCode();
    Client getClient();
}
