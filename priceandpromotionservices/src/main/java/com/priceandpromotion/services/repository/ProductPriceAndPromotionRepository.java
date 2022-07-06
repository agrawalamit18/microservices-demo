package com.priceandpromotion.services.repository;

import com.priceandpromotion.services.entity.ProductPriceAndPromotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductPriceAndPromotionRepository extends
        JpaRepository<ProductPriceAndPromotion, Long> {
    ProductPriceAndPromotion findProductPriceAndPromotionById(Long id);
}