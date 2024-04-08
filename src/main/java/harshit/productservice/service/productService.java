package harshit.productservice.service;
import harshit.productservice.model.Product;

import java.util.List;

public interface productService {
    public List<Product> getAllProducts();
    public Product getProductById(Long id);
    public List<String> getAllCategories();
    public List<Product> getProductByCategory(String Category);
}
