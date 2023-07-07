package com.isil.springdatajpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name="tbl_products")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Product implements Serializable {

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private Double productPrice;
    private Date createdAt;

    @PrePersist
    void prePersist(){
        this.createdAt= new Date();
    }
}
