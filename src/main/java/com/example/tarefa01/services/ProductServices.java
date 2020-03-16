package com.example.tarefa01.services;

import java.util.Collection;
import java.util.HashMap;

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

    public Product GetProdbyOrder(Integer code)
    {
        return pr.getProductbyOrder(code);
    }
        

    /*public Collection<Product>GetAllProducts()
    {
        HashMap<Integer,Product> aux = new HashMap<Integer,Product>();
        HashMap<Integer,Product> stock = new HashMap<Integer,Product>();

        aux = pr.getProducts();

        for(Product p : aux.values())
        {
            if(p.getStock()>0)
            {
                stock.put(p.getCode(),p);
            }
        }
        return stock.values();
    }*/
    public Collection<Product> getProd()
    {
        
        HashMap<Integer, Product> aux = new HashMap<Integer, Product>();
        HashMap<Integer, Product> Stock = new HashMap<Integer, Product>();

        aux = pr.getProducts();
        for(Product p:aux.values())
        {
            if(p.getStock() > 0)
            Stock.put(p.getCode(),p);
        }
        return Stock.values();
    } 
    public Collection<Product> GetProductsAbove20()
    {
        HashMap<Integer,Product> aux = new HashMap<Integer,Product>();
        HashMap<Integer, Product> AboveStock20 = new HashMap<Integer, Product>();

        aux = pr.getProducts();

        for(Product p : aux.values())
        {
            if(p.getValor() > 20)
            {
                AboveStock20.put(p.getCode(), p);
            }
        }
        return AboveStock20.values();
    }
    public Collection<Product> GetProductsBellow20()
    {
        HashMap<Integer,Product> aux = new HashMap<Integer,Product>();
        HashMap<Integer, Product> AboveBellow20 = new HashMap<Integer, Product>();

        aux = pr.getProducts();

        for(Product p : aux.values())
        {
            if(p.getValor() < 20)
            {
                AboveBellow20.put(p.getCode(), p);
            }
        }
        return AboveBellow20.values();
    }

    
    


    
}