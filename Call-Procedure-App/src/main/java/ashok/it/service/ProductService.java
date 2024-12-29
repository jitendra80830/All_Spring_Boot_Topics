package ashok.it.service;

import ashok.it.entities.Product;
import ashok.it.repo.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepo productRepo;

    //Constructor Inject
    public ProductService(ProductRepo productRepo){
        this.productRepo = productRepo;
    }

    public void getProducts(){
        List<Product> allProduct = productRepo.getAllProduct();
        allProduct.forEach(p -> {
            System.out.println(p);
        });
    }
}
