package be.cake.backend.dao;

import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Represents a store instance
 * @author manousidou
 *
 */
@Document
@Data
@NoArgsConstructor
@TypeAlias("Store")
public class Store {

	private String id, name, description;
	private Address address;
	private Date openFrom;
	private Date openUntil;
	private List<Product> products;
	private int rating;
	private List<Comment> comments;
	
	public Store(String name, String description) {
		this.name = name;
		this.description = description;
	}
}
