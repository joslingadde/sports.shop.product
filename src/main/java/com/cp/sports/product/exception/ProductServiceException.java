package com.cp.sports.product.exception;
/****************************
 *          @author          G.Joslin
 *          Description      It is a ProductServiceException exception class that handles the exception occurs at 
 *                           service level
  *         Version             1.0
  *         Created Date    22-MARCH-2021
 ****************************/

public class ProductServiceException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProductServiceException(String msg){
		super(msg);
		
	}

}
