package com.ute.shop.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailDto {

	private int orderDetailId;
	@Min(0)
	private int quantity;
	@Min(0)
	private double unitPrice;
	@NotEmpty
	private Integer productId;
	@NotEmpty
	private Integer orderId;
}
