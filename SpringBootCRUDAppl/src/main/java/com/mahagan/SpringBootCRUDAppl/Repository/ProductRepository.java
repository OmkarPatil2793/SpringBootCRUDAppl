package com.mahagan.SpringBootCRUDAppl.Repository;

import com.mahagan.SpringBootCRUDAppl.Domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
//@EnableJpaRepositories
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {


//    Product findByName(String name);
}
