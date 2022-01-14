package com.awanish.springweb.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.awanish.springweb.entites.Products;

public interface ProductsRepo extends JpaRepository<Products, Integer> {

}
