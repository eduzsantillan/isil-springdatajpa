package com.isil.springdatajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="tbl_customers")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Customer implements Serializable {

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Date createdAt;

    @OneToMany( fetch= FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "customer")
    private List<Order> orders;

}
