package com.mahagan.SpringBootCRUDAppl.Controller;

import com.mahagan.SpringBootCRUDAppl.Domain.Product;
import com.mahagan.SpringBootCRUDAppl.Service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductServiceImpl productService;
    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
    @PostMapping("/products")
    public List<Product> saveAllProduct(@RequestBody List<Product> products){
        return productService.saveAllProduct(products);
    }
    @GetMapping("/product/{productId}")
    public Product getSingleProductByID(@PathVariable int productId){
        return productService.getSingleProductByID(productId);
    }

    @GetMapping("/products")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    /*
    @GetMapping("/products/{name}")
    public Product getProductByName(@PathVariable String name){
        return productService.getProductByName(name);
    }

     */
    @PutMapping("/upadateProduct")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }
    @DeleteMapping("/product/{id}")
    public String deleteById(@PathVariable int id){
        return productService.deleteById(id);
    }


}
