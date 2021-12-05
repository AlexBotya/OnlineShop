package ru.gb.onlineShop.entity;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;
import java.util.Collection;

@Entity
//@Table(name = "products")

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data

public class Product {
    @Id
    @GeneratedValue
    @Column(name = "product_id")
    long id;
    String name;
    String description;
    @ManyToMany
    @JoinTable(
            name = "products_categories",
            joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "catrgory_id")
    )
    Collection<Category> categories;
    }

