package service;

import model.Category;
import model.Product;
import sun.util.resources.cldr.te.CalendarData_te_IN;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    List<Category> findAllCategory();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);

}
