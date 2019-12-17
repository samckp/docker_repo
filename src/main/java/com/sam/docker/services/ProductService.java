package com.sam.docker.services;

import com.sam.docker.model.Product;
import java.util.List;

public interface ProductService {
    public List<Product> getAllProduct();
    public Product getOneProduct(Long id);
    public Product createProduct(Product product);
    public boolean deleteProduct(Long id);
}
