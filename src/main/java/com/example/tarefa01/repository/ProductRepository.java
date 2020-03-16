package com.example.tarefa01.repository;

import java.util.HashMap;

import com.example.tarefa01.model.Product;

import org.springframework.stereotype.Repository;

/**
 * ProductRepository
 */
@Repository
public class ProductRepository 
{
    public HashMap<Integer,Product> hm = new HashMap<Integer,Product>();

    public ProductRepository()
    {
        hm.put(1,new Product(1, "Camiseta", 25.00, 10));
        hm.put(2,new Product(2, "Bermuda", 20.00, 15));
        hm.put(3,new Product(3, "Tênis", 35.00, 20));
        hm.put(4,new Product(4, "Cueca", 15.00, 25));
        hm.put(5,new Product(5, "Moletom", 45.00, 30));
        hm.put(6,new Product(6, "Touca", 5.00, 35));
        hm.put(7,new Product(7, "Colar", 10.00, 40));
        hm.put(8,new Product(8, "Pulseira", 2.00, 45));
        hm.put(9,new Product(9, "Meias", 24.00, 50));
        hm.put(10,new Product(10, "Pijama", 45.00, 55));
    }

    public Product getProductbyOrder(int code)
    {
        return hm.get(code);
    }
    public HashMap<Integer,Product> getProducts()
    {
        return hm;
    }

   
}