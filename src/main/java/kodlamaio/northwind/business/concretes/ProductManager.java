package kodlamaio.northwind.business.concretes;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entity.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductManager implements ProductService {

    @Autowired // Bağımlılık oluşturur.
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    private ProductDao productDao;

    @Override
    public List<Product> getAll() {
        return null;
    }
}
