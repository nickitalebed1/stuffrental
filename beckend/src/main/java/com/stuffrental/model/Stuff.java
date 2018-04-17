package com.stuffrental.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "stuff")

public class Stuff {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String name;

    @Column(name = "pricePerHour")
    private BigDecimal pricePerHour;

}
