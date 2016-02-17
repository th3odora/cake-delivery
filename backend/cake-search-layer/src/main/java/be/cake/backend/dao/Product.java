package be.cake.backend.dao;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Product {

	private String id, name, description, thumbNail;
	private List<String> assets;
	private int quantity;
}
