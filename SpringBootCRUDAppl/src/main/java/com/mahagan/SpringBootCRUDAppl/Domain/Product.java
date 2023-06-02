package com.mahagan.SpringBootCRUDAppl.Domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "PRODUCT_INFO")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int product_Id;
    private String product_Name;
    private String product_Details;
    private int product_Quantity;
    private double product_Price;
}
