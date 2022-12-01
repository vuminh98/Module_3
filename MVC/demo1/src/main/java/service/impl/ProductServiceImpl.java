package service.impl;

import model.Category;
import model.Product;
import service.IProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements IProductService {
    private static ArrayList<Product> products;
    private static ArrayList<Category> categories;
    private static Long INDEX;

    static {
        categories = new ArrayList<>();
        categories.add(new Category("SUV",1L));
        categories.add(new Category("Coupe",2L));
        categories.add(new Category("SUV",3L));
    }

    static {
        products = new ArrayList<>();
        products.add(new Product("panamera",9000.0,50,categories.get(0)));
        products.add(new Product("panamera",9000.0,50,categories.get(1)));
        products.add(new Product("panamera",9000.0,50,categories.get(2)));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(Long id) {
        for (Product p: products) {
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

    }

    @Override
    public List<Product> findByNameContaining(String name) {
        return null;
    }
}
