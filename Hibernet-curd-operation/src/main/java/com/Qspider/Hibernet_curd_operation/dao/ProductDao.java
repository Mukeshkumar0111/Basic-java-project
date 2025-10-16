package com.Qspider.Hibernet_curd_operation.dao;

import java.util.List;

import com.Qspider.Hibernet_curd_operation.dto.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class ProductDao {

//	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// This method will save the data in data base!!
	public Product saveProduct(Product product) {
		try {
			entityTransaction.begin();
			entityManager.persist(product);
			entityTransaction.commit();
			return product;
		} catch (Exception e) {
			e.printStackTrace();
			if (entityTransaction.isActive()) {
				entityTransaction.rollback(); // rollback of failure
			}
			return null;
		}

	}

	// Method to read Product by Id
	public Product findProductByIdDao(int id) {
		Product product = entityManager.find(Product.class, id);

		return product != null ? product : null;
	}

	public List<Product> getProductsByColorDao(String color) {
		Query query = entityManager.createQuery("select p from Product P where p.color = :color");
		query.setParameter("color", color);
		List< Product> l=query.getResultList();
		return l;

	}

	public boolean deleteProductByColorDao(String color) {
		try {
			Query query = entityManager.createQuery("Select p from Product p where p.color = ?1");
			query.setParameter(1, color);

			int q = query.executeUpdate();
			return q != 0 ? true : false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
