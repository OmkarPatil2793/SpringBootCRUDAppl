package com.mahagan.SpringBootCRUDAppl.Service;

import com.mahagan.SpringBootCRUDAppl.Domain.Product;

import java.util.List;

public interface ProductService {

    //Save the single product infonmation
   public Product saveProduct(Product product);

    //Save the list of all products infonmation
    public List<Product> saveAllProduct(List<Product> products);

    //Get the single product information of product
    public Product getSingleProductByID(int productId);

    //Get all the product information
    public List<Product> getAllProduct();

    //get the product by Name
    //public Product getProductByName(String name);

    // delete the product by id
    public String deleteById(int id);

    //update the product
    public Product updateProduct(Product product);

}
