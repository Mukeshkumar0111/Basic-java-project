package com.Qspider.Hibernet_curd_operation.controller;

import com.Qspider.Hibernet_curd_operation.dto.ProductOrder;
import com.Qspider.Hibernet_curd_operation.dto.ProductOrderCompositeKey;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ProductOrderController {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jpa");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		ProductOrderCompositeKey compositeKey = new ProductOrderCompositeKey();
		compositeKey.setOrderId(39028);
		compositeKey.setProductId(45);
		
		ProductOrder productOrder=new ProductOrder();
		
		productOrder.setCompositeKey(compositeKey);
		productOrder.setAddress("201301-noida ");
		productOrder.setFinalprice(3232432);
		
		entityTransaction.begin();
		
		entityManager.persist(productOrder);
		entityTransaction.commit();
	}
}
