package com.ute.shop.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	@Column(nullable = false)
	private double amount;
	@Column(nullable = false)
	private short status;
	@Column(columnDefinition = "nvarchar(500) not null")
	private String address;
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	
	@OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
	private Set<OrderDetail> orderDetails;
	
	@PrePersist
	public void preCreate() {
		amount = 0f;
		orderDate = new Date();
	}
	@PreUpdate 
	public void preUpdate() {
		orderDate = new Date();
	}
}

