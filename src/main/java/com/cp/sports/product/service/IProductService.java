package com.cp.sports.product.service;

import java.util.List;

import com.cp.sports.product.entity.Product;
import com.cp.sports.product.exception.ProductServiceException;

public interface IProductService {

	public Product addProduct(Product product);

	public void removeProduct(String product)  throws ProductServiceException;

	public Product updateProduct(String id, Product product);

	public Product getProduct(String id);

	public List<Product> getAllProduct();

	public List<Product> getProductsByName(String name);

	public List<Product> getProductsBySize(String sizes);

	public List<Product> getProductsByPrice(double priceAfterDiscount);

	public List<Product> getProductsByColor(String color);

}
