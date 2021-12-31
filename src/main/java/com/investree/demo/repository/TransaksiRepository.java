package com.investree.demo.repository;


import com.investree.demo.model.Transaksi;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface TransaksiRepository extends PagingAndSortingRepository<Transaksi, Long> {
    @Query("select c from Transaksi c WHERE c.id = :id")
    public Transaksi getByID(@Param("id") Long id);
}