package com.example.tarefa01.model;

/**
 * Product
 */
public class Product 
{
    private int code;
    private String name;
    private double valor;
    private int stock;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Product(int code, String name, double valor, int stock) {
        this.code = code;
        this.name = name;
        this.valor = valor;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product [code=" + code + "]";
    }


    

    
}