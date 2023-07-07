package com.isil.springdatajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="tbl_orders")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Order implements Serializable {

    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String details;
    private String description;


    @ManyToOne
    @JoinColumn(name = "customer_id")
    @JsonIgnoreProperties({"orders","createdAt","id","email"})

    private Customer customer;


    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="order_id")
    private List<OrderItem> items;

}
