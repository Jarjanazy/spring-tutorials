package com.example.demo.hibernatetips.entity;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ORDERS")
@Data
public class Order{
    @Id
    @GeneratedValue
    Integer id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ORDER_ID")
    List<OrderLine> orderLines = new ArrayList<>();
}

