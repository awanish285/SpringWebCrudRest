package com.awanish.springweb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.awanish.springweb.entites.Products;

@SpringBootTest
class ProductrestapiApplicationTests {

	@Value("${productrestapi.services.url}")
	private String baseURL;
	//this method is used to get the product using Resttemplate clinet 
	@Test
	public void testGetProduct() {
        System.out.println("baseURL "+baseURL);
		RestTemplate restTemplate = new RestTemplate();
		Products responseProducts = restTemplate.getForObject(baseURL + "2",
				Products.class);
		assertNotNull(responseProducts);
		assertEquals("IPHONE-14", responseProducts.getName());

	}
    //this method is used to creatTest Product using RestTemplate client
	@Test
	public void testCreateProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Products product = new Products();
		product.setName("Samsung mobile");
		product.setDescription("Good");
		product.setPrice(200);
		Products postForObject = restTemplate.postForObject("http://localhost:8080/productrestapi/products/", product,
				Products.class);
		assertNotNull(postForObject);
		assertNotNull(postForObject.getId());
		assertNotNull("Samsung mobile", postForObject.getName());

	}
    //this method is used to update the product using resttemplate client
	@Test
	public void testUpdateProduct() {

		RestTemplate restTemplate = new RestTemplate();
		Products responseProducts = restTemplate.getForObject(baseURL+"2",
				Products.class);
		responseProducts.setPrice(1500);
		restTemplate.put(baseURL, responseProducts);
		assertNotNull(responseProducts);
		assertEquals("IPHONE-14", responseProducts.getName());

	}

}
