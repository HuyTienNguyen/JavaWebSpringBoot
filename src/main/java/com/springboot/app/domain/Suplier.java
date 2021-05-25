package com.springboot.app.domain;
import java.util.Collection;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;


@Entity
@Data
@Table(name="supliers")
public class Suplier {
		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")	
	    private Long id;
		@Column
		private String name;
		@Column
		private String address;
		@Column(length=20)
		private String phone;
		@Column
		private String email;
		@Column
		private String description;
		@Column(length=2)
		private int status;
		 @ManyToMany(mappedBy = "suplier_product")
		    private Set<Product> products;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		public Set<Product> getProducts() {
			return products;
		}
		public void setProducts(Set<Product> products) {
			this.products = products;
		}
		 
}