package com.mahagan.SpringBootCRUDAppl.Service;

import com.mahagan.SpringBootCRUDAppl.Domain.Product;
import com.mahagan.SpringBootCRUDAppl.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl  implements  ProductService{

    @Autowired
    ProductRepository productRepository;
    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> saveAllProduct(List<Product> products) {
        return productRepository.saveAll(products);
    }

    @Override
    public Product getSingleProductByID(int productId) {
        return productRepository.findById(productId).orElse(null);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
/*
    @Override
    public Product getProductByName(String name) {
        return productRepository.findByName(name);
    }
*/
    @Override
    public String deleteById(int id) {
        productRepository.deleteById(id);
        return "Product removed SuccessFully!!!";

    }

    @Override
    public Product updateProduct(Product product) {
        Product prod = productRepository.findById(product.getProduct_Id()).orElse(null);
        prod.setProduct_Name(product.getProduct_Name());
        prod.setProduct_Details(product.getProduct_Details());
        prod.setProduct_Price(product.getProduct_Price());
        prod.setProduct_Quantity(product.getProduct_Quantity());
        return productRepository.save(prod);
    }
}
