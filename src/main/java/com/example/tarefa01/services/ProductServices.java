package com.example.tarefa01.services;

import com.example.tarefa01.model.Product;
import com.example.tarefa01.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProductServices
 */
@Service
public class ProductServices 
{
    
    @Autowired
    private ProductRepository pr;

    public Product getProductByOrder(int code)
    {
        Product prod = pr.getProductbyOrder(code);

        return prod;
    }


    
}