package com.example.task221.entity;

import com.example.task221.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"corpName", "address_id"})})
public class Warehouse extends AbsEntity {
    @ManyToMany(mappedBy = "warehouses")
    private Set<User> userSet;

}
