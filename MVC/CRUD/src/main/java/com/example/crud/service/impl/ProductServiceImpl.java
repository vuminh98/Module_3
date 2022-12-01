package com.example.crud.service.impl;

import com.example.crud.model.Category;
import com.example.crud.model.Product;
import com.example.crud.service.IProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements IProductService {
    private static ArrayList<Product> products;
    private static ArrayList<Category> categories;
    private static Long INDEX;

    static {
        categories = new ArrayList<>();
        categories.add(new Category("coupe",1L));
        categories.add(new Category("SUV", 2L));
        categories.add(new Category("SUV",3L));
    }

    static {
        products = new ArrayList<>();
        products.add(new Product("panamera", 99999.0, 50, categories.get(1)));
        products.add(new Product("macan", 80000.0, 60, categories.get(2)));
        products.add(new Product("cayenne", 120000.0, 70, categories.get(3)));
        INDEX = products.get(products.size() - 1).getId();
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(Long id) {
        for (Product p : products) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void save(Product product) {
        if (product.getId() == null) {
            product.setId(++INDEX);
        }
        products.add(product);
    }

    @Override
    public void deleteById(Long id) {
products.remove(id);
    }

    @Override
    public List<Product> findByNameContaining(String name) {
        return null;
    }
}
