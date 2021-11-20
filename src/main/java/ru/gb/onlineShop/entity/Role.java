package ru.gb.onlineShop.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private long id;

    private String name;
    @ManyToMany(mappedBy = "roles")
    private Collection<User> users;
}
