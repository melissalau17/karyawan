package com.investree.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.investree.demo.model.Transaksi;
import lombok.Data;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, length = 45)
    private String username;

    @Column(name = "password", nullable = false, length = 20)
    private String password;

    @Column(name = "is_active")
    private boolean isActive;


}

