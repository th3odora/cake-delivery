package be.cake.backend.dao;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents an order
 * @author manousidou
 *
 */

@Getter
@Setter
@NoArgsConstructor
public class Order {
	
	private String storeId;
	private String status;
	private Date placedAt;
	private List<Product> products;
	private List<Comment> comments;
	
	
}
