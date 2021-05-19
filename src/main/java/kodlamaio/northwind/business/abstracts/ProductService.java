package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.entity.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
