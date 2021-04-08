package com.cp.sports.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cp.sports.product.entity.Cart;
/**********
 * @author G.Joslin
 * Description : It is a cart repository interface that extends JPA repository 
 *               that contains inbuilt methods for various operations
 *Version 1.0 
 *Created Date 23-March-2021
 **********/


public interface ICartRepository  extends JpaRepository<Cart, Long>{

}
