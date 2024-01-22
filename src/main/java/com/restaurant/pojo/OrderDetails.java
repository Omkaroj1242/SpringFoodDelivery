package com.restaurant.pojo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "orders")
public class OrderDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long orderId;

  private String name;
  private String email;
  private String contact;
  private Double amount;
  private String address;
  private String city;
  private String state;
  private String zip;
  
  private Long userId;
  private String paymentMethod;
  private String paymentId;
  private LocalDate orderDate;
@Override
public String toString() {
	return "OrderDetails [orderId=" + orderId + ", name=" + name + ", email=" + email + ", contact=" + contact
			+ ", amount=" + amount + ", address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip
			+ ", userId=" + userId + ", paymentMethod=" + paymentMethod + ", paymentId=" + paymentId + ", orderDate="
			+ orderDate + "]";
}

}