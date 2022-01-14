package com.awanish.springweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.awanish.springweb.entites.Products;
import com.awanish.springweb.repositery.ProductsRepo;

@RestController
public class ProductsRestController {
	
	@Autowired
	ProductsRepo productsRepo;
	@RequestMapping(value="/products/",method=RequestMethod.GET)
	public List<Products> getProducts()
	{
		return productsRepo.findAll();
	}
	
	@RequestMapping(value="/products/{id}",method=RequestMethod.GET)
	public Products getProductbyId(@PathVariable("id") int id)
	{
		return productsRepo.findById(id).get();
	}
	
	@RequestMapping(value="/products/",method=RequestMethod.POST)
	public Products createProduct(@RequestBody Products product)
	{
		 return productsRepo.save(product);
	}
	
	@RequestMapping(value="/products/",method=RequestMethod.PUT)
	public Products updateProduct(@RequestBody Products product)
	{
		 return productsRepo.save(product);
	}
	
	@RequestMapping(value="/products/{id}",method=RequestMethod.DELETE)
	public void deleteProductbyId(@PathVariable("id") int id)
	{
	        productsRepo.deleteById(id);
	}
	

}
