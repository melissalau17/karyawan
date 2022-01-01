package com.investree.demo.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "transaksi")
public class Transaksi implements Serializable {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tenor", nullable = false, length = 3)
    private Integer tenor;

    @Column(name = "total_pinjaman")
    private Double totalPinjaman;

    @Column(name = "bunga_persen")
    private Double bungaPersen;

    @Column(name = "status", nullable = false, length = 50)
    private String status;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_peminjam", referencedColumnName = "id")
    private User peminjam;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_meminjam", referencedColumnName = "id")
    private User meminjam;
}

