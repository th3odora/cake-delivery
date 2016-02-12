package be.cake.backend.dao;

import lombok.Data;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Represents a store instance
 * @author manousidou
 *
 */
@Document
@Data
public class Store {

	private String id, name, description;
	private Address address;
	
	public Store(String name, String description) {
		this.name = name;
		this.description = description;
	}
}
