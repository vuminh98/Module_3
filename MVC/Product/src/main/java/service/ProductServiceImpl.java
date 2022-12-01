package service;

import model.Category;
import model.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static ArrayList<Category> categories;
    private static ArrayList<Product> products;
    private Long INDEX;




    static {
        categories = new ArrayList<>();
        categories.add(new Category("GOLD"));
        categories.add(new Category("SILVER"));
        categories.add(new Category("BRONZE"));
        products = new ArrayList<>();
        products.add(new Product("USP", 900.0, "Rife", categories.get(0)));
        products.add(new Product("AWM", 900.0, "Rife", categories.get(1)));
        products.add(new Product("AK47", 900.0, "Rife", categories.get(2)));
    }


    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public List<Category> findAllCategory() {
        return categories;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
