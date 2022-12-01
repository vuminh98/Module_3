package com.example.crud.service;

import com.example.crud.model.Product;

import java.util.List;

public interface IProductService extends ICoreCRUDService<Product, Long>{
    List<Product> findByNameContaining(String name);
}
