package com.rhitwik.awssecret;

import com.rhitwik.awssecret.model.Product;
import com.rhitwik.awssecret.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class DBController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping("/add")
    public Product AddProduct(@RequestBody Product product)
    {
        return productRepository.save(product);
    }

    @GetMapping("/getall")
    public List<Product> FindAllProduct()
    {
        return productRepository.findAll();
    }

}
