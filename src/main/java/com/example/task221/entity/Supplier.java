package com.example.task221.entity;

import com.example.task221.entity.template.AbsEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Supplier extends AbsEntity {
    @Column
    private Integer phoneNumber;
}
