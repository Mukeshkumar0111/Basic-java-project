package com.Qspider.Hibernet_curd_operation.controller;

import java.time.LocalDate;

import com.Qspider.Hibernet_curd_operation.dao.ProductDao;
import com.Qspider.Hibernet_curd_operation.dto.Product;

public class InsertProductController {
	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		
		Product product = new Product();
		product.setId(104);
		product.setNameString("Marker");
		product.setColor("black");
		product.setPrice(50.3);
		product.setMfDate(LocalDate.parse("2025-09-09"));
		product.setExpDate(LocalDate.parse("2029-12-12"));
		
		Product productsaveProduct = dao.saveProduct(product);
		if(productsaveProduct != null)
			System.out.println("Data Saved Successfully!!!");
		else {
			System.out.println("Something Wrong!!!!!");
		}
	}

}

