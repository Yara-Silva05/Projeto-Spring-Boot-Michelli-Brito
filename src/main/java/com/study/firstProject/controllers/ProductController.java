package com.study.firstProject.controllers;

import com.study.firstProject.repositories.ProductRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductRepositories productRepositories;


}
