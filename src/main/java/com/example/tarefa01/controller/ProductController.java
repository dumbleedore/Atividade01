package com.example.tarefa01.controller;

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
        ModelAndView mv = new ModelAndView("productview");

        Product produto = ps.getProductByOrder(code);
        mv.addObject("produto", produto);
        return mv;
    }
        
    

   
    

    
}