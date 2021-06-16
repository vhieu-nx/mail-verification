package com.mailverification;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id")
    private int id;

    private String name;

    private String email;

    private String password;

    @Column(name = "is_Active")
    private boolean isActive;
}
