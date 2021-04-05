package com.cp.sports.product.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cp.sports.product.entity.Product;
import com.cp.sports.product.exception.ProductServiceException;
import com.cp.sports.product.service.ProductService;

@SpringBootTest
public class ProductServiceTest {
	@Autowired
	private ProductService productservice;
	private Product product;

	@Test
	void updateProductTest() {
		System.out.println(productservice.updateProduct("1235", product));
		assertEquals(
				"Product [ productId=1235,productName=FootBall,category=Ball, description=WaterResistent OuterMaterial Rubber,brand=Vector X Attacker,"
						+ "color=MultiColor,mrp=549,discount=51,priceAfterDiscount=269,inStock=true, estimatedDelivery=2021-03-27,size=6ft]",
				productservice.updateProduct("1234", product).toString());
	}

	@Test
	void addProductTest() {
		assertNotNull(product.getProductId());
		System.out.println(productservice.getProduct("1235"));
		System.out.println(productservice.getAllProduct().size());
	}

	@Test
	void deleteTest() {
		assertThrows(ProductServiceException.class, () -> {
			productservice.removeProduct("1238");
		});
	}

	@Test
	void getIdTest1() {

		assertEquals("Football Shoes", productservice.getProduct("1235").getProductName().toString());
	}

	@Test
	void getPriceTest() {

		assertEquals(560.0, productservice.getProduct("1236").getPriceAfterDiscount());
	}

	@Test
	void getColorTest() {
		assertEquals("Black", productservice.getProduct("1236").getColor());
	}

	@Test
	void getSizeTest() {
		assertEquals("5ft", productservice.getProduct("1235").getSize());
	}

}
