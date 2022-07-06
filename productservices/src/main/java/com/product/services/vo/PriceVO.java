package com.product.services.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceVO {
    private Long id;
    private double listPrice;
    private double discountPercentage;
    private double discountAmount;
    private String promoDescription;
    private double finalAmount;
}