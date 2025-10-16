package com.Qspider.Hibernet_curd_operation.dto;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Product {

	@Id
	private int id;
	private String nameString;
	private String color;
	private double price;
	private LocalDate mfDate;
	private LocalDate expDate;
	
	
}
