package com.example.task221.entity;

import com.example.task221.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Entity
//@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"corpName", "address_id"})})
public class Warehouse extends AbsEntity {

}
