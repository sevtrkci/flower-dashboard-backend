package com.flower.flowerdashboardbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class Flower {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Flower_Name")
    private String name;

    @Column( length = 500)
    private String description;

    @Column(length = 500)
    private String imageSource;

    private BigDecimal price;

    private BigDecimal oldPrice;
}
