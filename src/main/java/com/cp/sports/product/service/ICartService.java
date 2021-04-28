package com.cp.sports.product.service;

import java.util.List;

import com.cp.sports.product.entity.Cart;

public interface ICartService {
	
	public Cart addToCart(Cart cart);

	public List<Cart> getAllCart();

	public void removeCart(long cart);
}
