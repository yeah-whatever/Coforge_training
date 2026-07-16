package com.coforge.service;

import java.util.Collection;
import java.util.HashMap;
import org.springframework.stereotype.Service;
import com.coforge.model.Product;

@Service
public class ProductService {

    HashMap<Integer, Product> products = new HashMap<>();

    
    public boolean addProduct(Product product) {

        if (products.containsKey(product.getProductId())) {
            return false;
        }

        products.put(product.getProductId(), product);
        return true;
    }

  
    public Collection<Product> getAllProducts() {
        return products.values();
    }

    public Product searchProduct(int id) {
        return products.get(id);
    }

    public boolean updateProduct(Product product) 
    {

        if (products.containsKey(product.getProductId())) 
        {
            products.put(product.getProductId(), product);
            return true;
        }

        return false;
    }


    public boolean deleteProduct(int id) 
    {

        if (products.containsKey(id)) 
        {
            products.remove(id);
            return true;
        }

        return false;
    }
}