package com.ute.shop.domain;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "suppliers")
public class Supplier implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer supplierId;
	@Column(length = 100, nullable = false,columnDefinition = "nvarchar(100)")
	private String name;
	
	@OneToMany(mappedBy = "supplier" ,cascade = CascadeType.ALL)
	private Set<Product> products;
}
