package be.cake.backend.dao;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Subscription {

	private String storeId;
	private Date validFrom, validUntil;
	private List<Product> products;
	
	
}
