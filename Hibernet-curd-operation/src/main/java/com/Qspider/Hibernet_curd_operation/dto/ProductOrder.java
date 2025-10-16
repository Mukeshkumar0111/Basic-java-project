package com.Qspider.Hibernet_curd_operation.dto;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class ProductOrder {
	
	@EmbeddedId
	private ProductOrderCompositeKey compositeKey;
	private double finalprice;
	private String address;
	

}
