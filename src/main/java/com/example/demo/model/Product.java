package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@ToString

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private int quantity;

}
