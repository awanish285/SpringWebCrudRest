package com.awanish.springweb.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.awanish.springweb.entites.Products;
//Repositery of product 
public interface ProductsRepo extends JpaRepository<Products, Integer> {

}
