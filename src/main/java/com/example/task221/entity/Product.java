package com.example.task221.entity;

import com.example.task221.entity.template.AbsEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Product extends AbsEntity {

    @ManyToOne(optional = false)
    private Category category;

    @OneToOne
    private Attachment attachment;

    private String code;

    @ManyToOne
    private Measurement measurement;

}
