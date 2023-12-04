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
@Table(name = "categories")
public class Category implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer categoryId;
	@Column(length = 100, nullable = false,columnDefinition = "nvarchar(100)")
	private String name;
	
	@OneToMany(mappedBy = "category" ,cascade = CascadeType.ALL)
	private Set<Product> products;
}
