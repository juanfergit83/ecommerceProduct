package com.jf.ecommerce.product.product;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

  private ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

}
