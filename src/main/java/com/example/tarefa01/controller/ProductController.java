package com.example.tarefa01.controller;

import java.util.Collection;

import com.example.tarefa01.model.Product;
import com.example.tarefa01.services.ProductServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ProductController
 */
@Controller
@RequestMapping("/app")
public class ProductController 
{
    @Autowired
    private ProductServices ps;

    @GetMapping("/product/{code}")
    public ModelAndView getProd(@PathVariable("code")int code)
    {
        ModelAndView mv = new ModelAndView("prodbyorder");

        Product prod = ps.GetProdbyOrder(code);
        mv.addObject("prods", prod);
        return mv;
    }
    @GetMapping("/productsinstock")
    public ModelAndView GetAllProds()
    {
        ModelAndView pr = new ModelAndView("allprods");
        Collection<Product> prod = ps.getProd();
        pr.addObject("prods", prod);
        return pr;
    }

    @GetMapping("/productsabove20")
    public ModelAndView GetProdsAbove()
    {
        ModelAndView pr = new ModelAndView("above20");
        Collection<Product> prod = ps.GetProductsAbove20();
        pr.addObject("prods",prod);
        return pr;
    }
    @GetMapping("/productsbellow20")
    public ModelAndView GetProdsBellow()
    {
        ModelAndView pr = new ModelAndView("bellow20");
        Collection<Product> prod = ps.GetProductsBellow20();
        pr.addObject("prods",prod);
        return pr;
    }
    

   
    

    
}