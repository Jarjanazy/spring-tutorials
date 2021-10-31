package com.example.demo.hibernatetips.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class OrderLine
{
    @Id
    @GeneratedValue
    Integer id;
}
