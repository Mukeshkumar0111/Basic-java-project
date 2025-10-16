package com.Qspider.Hibernet_curd_operation.controller;

import java.util.List;

import com.Qspider.Hibernet_curd_operation.dao.ProductDao;
import com.Qspider.Hibernet_curd_operation.dto.Product;

public class GetProductByIdController {
	public static void main(String[] args) {
		
//		Product product =new ProductDao().findProductByIdDao(101);
		List<Product> list = new ProductDao().getProductsByColorDao("black");
		for(Product p : list) {
			System.out.println(p);
		}
//		if(product != null) {
//			System.out.println(product);
//		}else {
//			System.out.println("given id not found!!!");
//		}
	}

}
