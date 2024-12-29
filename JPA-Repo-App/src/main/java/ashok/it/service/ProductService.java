package ashok.it.service;

import ashok.it.entities.Product;
import ashok.it.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public void qbeExa(){

        Product entity = new Product();
        entity.setName("book");
        entity.setPid(102);
        entity.setPrice(50.0);

        List<Product> products = repo.findAll(Example.of(entity));

        products.forEach(record -> {
            System.out.println(record);
        });
    }

    public void pagination(){
        int pageSize = 3;
        int pageNo = 0; // 0 means page 1

        PageRequest of = PageRequest.of(pageNo , pageSize);

        Page<Product> page = repo.findAll(of);

        int totalPage = page.getTotalPages();
        System.out.println("Total page Required ... "+totalPage);

        List<Product> products = page.getContent();

        products.forEach(p->{
            System.out.println(p);
        });
    }
    public void getProducts(){
        List<Product> records = repo.findAll(Sort.by("price").descending());

        records.forEach(record ->{
            System.out.println(record);
        });
    }
    public void saveProducts(){
        Product entity = new Product(101 , "Book", 50.0);
        Product entit1 = new Product(102 , "Pen", 10.0);
        Product entit2 = new Product(103 , "Copy", 502.0);
        Product entit3 = new Product(104 , "Table", 522.0);
        Product entit4 = new Product(105 , "Chairs", 520.0);
        Product entit5 = new Product(106 , "Stick", 52.0);


        repo.saveAll((Arrays.asList(entity ,entit1,entit2,entit3,entit4,entit5)));
    }
}
