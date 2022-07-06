package com.priceandpromotion.services.controller;

import com.priceandpromotion.services.entity.ProductPriceAndPromotion;
import com.priceandpromotion.services.services.ProductPriceAndPromotionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/price")
@Slf4j

public class ProductPriceAndPromotionController {

    @Autowired
    private ProductPriceAndPromotionService productPriceAndPromotionService;

    @GetMapping("/status")
    public String status() {
        return "Product price and promotion service is running.";
    }

    @PostMapping("/save")
    public ProductPriceAndPromotion saveProduct (@RequestBody ProductPriceAndPromotion product) {
        return productPriceAndPromotionService.save (product);
    }
    @GetMapping ("/{id}")
    public ProductPriceAndPromotion getById(@PathVariable ("id") Long id) {

        return productPriceAndPromotionService.getProductById (id);
    }

}
