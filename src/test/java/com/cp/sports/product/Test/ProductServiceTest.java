package com.cp.sports.product.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.util.ArrayList;

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

	static ArrayList<Product> list = new ArrayList<>();

	@Test
	void updateProductTest() {
		Product uptest1 = new Product("1235", "BackPack", "Bag", "Full space", "Levis", "Burgundy", " full length",
				"790rs", 24, 450.0, true, LocalDate.of(2021, 04, 12));
		assertEquals("1235", productservice.updateProduct("1235", uptest1).getProductId());

	}

	@Test
	void addProductTest() {
		LocalDate deliveryDate = LocalDate.parse("2021-04-07");
		Product product = new Product("1234", "KneePad", "Pad", "Soft inner lining", "Vicki", "White", "Oval", "150rs",
				20, 130.0, true, deliveryDate);
		assertEquals(product.toString(), productservice.addProduct(product).toString());
		list.add(product);

	}

	@Test
	void deleteTest() {
		assertThrows(ProductServiceException.class, () -> {
			productservice.removeProduct("1238");
		});
	}

	@Test
	void getIdTest() {

		assertEquals("BackPack", productservice.getProduct("1235").getProductName().toString());
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
		assertEquals(" full length", productservice.getProduct("1235").getSize());
	}

}
