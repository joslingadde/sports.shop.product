package com.cp.sports.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cp.sports.product.entity.Product;
/**********
 * @author G.Joslin 
 * Description: It is a Product repository interface that extends JPA repository 
 *                        that contains inbuilt methods for various operations
 *Version: 1.0 
 *Created Date: 23-March-2021
 **********/
public interface IProductRepository extends JpaRepository<Product, String> {
	@Query("select p from Product p where p.productName="+"name")
	List<Product> findByProductName(String name);
	   
	
	@Query("select p from Product p where p.sizes= "+"sizes")
	List<Product> findBySizes(String sizes);
	
	@Query("select p from Product p where p.priceAfterDiscount= "+"priceAfterDiscount")
	List<Product> findByPriceAfterDiscount(double priceAfterDiscount);
	
	@Query("select p from Product p where p.color= "+"color")
	List<Product> findByColor(String color);


	
}
