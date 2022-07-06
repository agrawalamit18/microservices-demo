package com.product.services.services;

import com.product.services.entity.Product;
import com.product.services.repository.ProductRepository;
import com.product.services.vo.PriceVO;
import com.product.services.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public ResponseVO getProductById(Long id) {
        Product prd =  productRepository.getProductById (id);
        PriceVO pvo = restTemplate.getForObject("http://PRICE-AND-PROMOTION-SERVICE/price/1", PriceVO.class);
        ResponseVO rvo = new ResponseVO();
        rvo.setProduct(prd);
        rvo.setPrice(pvo);
        return rvo;
    }
}
