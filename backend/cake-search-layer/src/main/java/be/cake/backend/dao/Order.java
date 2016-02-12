package be.cake.backend.dao;

import lombok.Data;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Represents an order
 * @author manousidou
 *
 */
@Document
@TypeAlias("Order")
@Data
public class Order {

	private String id;
	private User user;
	private Store store;
	
	
}
