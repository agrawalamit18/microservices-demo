package com.priceandpromotion.services.services;

import com.priceandpromotion.services.entity.ProductPriceAndPromotion;
import com.priceandpromotion.services.repository.ProductPriceAndPromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductPriceAndPromotionService {

    @Autowired
    private ProductPriceAndPromotionRepository productPriceAndPromotionRepository;


    public ProductPriceAndPromotion getProductById(Long id) {
        return productPriceAndPromotionRepository.findProductPriceAndPromotionById(id);
    }

    public ProductPriceAndPromotion save(ProductPriceAndPromotion product) {
        return productPriceAndPromotionRepository.save(product);
    }
}