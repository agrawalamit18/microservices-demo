package com.priceandpromotion.services.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "product_price_and_promotion")

public class ProductPriceAndPromotion {
    @Id
    private Long id;

    private double listPrice;
    private double discountPercentage;
    private double discountAmount;
    private String promoDescription;
    private double finalAmount;
}