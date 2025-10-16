package com.Qspider.Hibernet_curd_operation.dto;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class ProductOrderCompositeKey implements Serializable {

	
	private int orderId;
	private int productId;
	
}
