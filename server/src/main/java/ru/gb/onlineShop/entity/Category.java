package ru.gb.onlineShop.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Collection;

@Entity
//@Table(name = "categories")

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Category {
    @Id
    @GeneratedValue
    @Column(name = "category_id")
    private long id;
    private String name;
    @ManyToMany(mappedBy = "categories")
    private Collection<Product> products;
}
