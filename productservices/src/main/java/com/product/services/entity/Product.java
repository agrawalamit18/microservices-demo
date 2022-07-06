package com.product.services.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "product")
public class Product {

    @Id
    private Long id;

    private String productName;

    private String productDescription;

    private Long priceItemId;
}