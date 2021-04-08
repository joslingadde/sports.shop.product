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
import com.cp.sports.product.service.IProductService;

@SpringBootTest
public class ProductServiceTest {
	@Autowired
	private IProductService productservice;

	static ArrayList<Product> list = new ArrayList<>();

	/*******************
	 * Method :updateProductTest Description : To test the updateProduct method of
	 * the productservice Created By - G.Joslin Created Date - 22-March-2021
	 *******************/
	@Test
	void updateProductTest() {
		Product uptest1 = new Product("1234", "FootBallShoes", "Shoes", "Flexible", "Rebook", "Red", "6ft",
				"970rs", 34, 650.0, true, LocalDate.of(2021, 04, 16));
		assertEquals("1234", productservice.updateProduct("1234", uptest1).getProductId());

	}

	/*******************
	 * Method :addProductTest Description : To test the addProduct method of the
	 * productservice Created By - G.Joslin Created Date - 22-March-2021
	 *******************/

	@Test
	void addProductTest() {
		LocalDate deliveryDate = LocalDate.parse("2021-04-06");
		Product product = new Product("1233", "Skipping rope", "rope", "with handle", "Malin", "Brown", "35inch", "150rs",
				20, 120.0, true, deliveryDate);
		assertEquals(product.toString(), productservice.addProduct(product).toString());
		list.add(product);

	}

	/*******************
	 * Method :deleteProductTest Description : To test the deleteProduct method of
	 * the productservice Created By - G.Joslin Created Date - 22-March-2021
	 *******************/

	@Test
	void deleteTest() {
		assertThrows(ProductServiceException.class, () -> {
			productservice.removeProduct("1235");
		});
	}

	/*******************
	 * Method :getProductTest Description : To test the getProduct method of the
	 * productservice Created By - G.Joslin Created Date - 22-March-2021
	 *******************/

	@Test
	void getIdTest() {

		assertEquals("Gloves", productservice.getProduct("1232").getProductName().toString());
	}

	/*******************
	 * Method :getPriceTest Description : To test the getProduct by price method of
	 * the productservice Created By - G.Joslin Created Date - 22-March-2021
	 *******************/

	@Test
	void getPriceTest() {

		assertEquals(200, productservice.getProduct("1239").getPriceAfterDiscount());
	}

	/*******************
	 * Method :getColorTest Description : To test the getProduct by color method of
	 * the productservice Created By - G.Joslin Created Date - 22-March-2021
	 *******************/

	@Test
	void getSizeTest() {
		assertEquals("5ft", productservice.getProduct("1231").getSize());
	}
	@Test
	void getNameTest() {
		assertEquals("Running shoes", productservice.getProduct("1230").getProductName());
	}
	@Test
	void getIdTest2() {
		assertEquals("DenimCap", productservice.getProduct("1239").getProductName().toString());
	}
	@Test
	void getColorTest2() {
		assertEquals("Red", productservice.getProduct("1234").getColor());
	}
	@Test
	void getPriceTest2() {
		assertEquals(90.0, productservice.getProduct("1232").getPriceAfterDiscount());
	}


}
