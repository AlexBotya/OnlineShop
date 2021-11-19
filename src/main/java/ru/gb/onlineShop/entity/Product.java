package ru.gb.onlineShop.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Collection;
//import java.util.List;


@Entity
//@Table(name = "products")

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data

public class Product {
    @Id
    @GeneratedValue
    long id;
    String name;
    String description;
    @ManyToMany
    Collection<Category> categories;
}
