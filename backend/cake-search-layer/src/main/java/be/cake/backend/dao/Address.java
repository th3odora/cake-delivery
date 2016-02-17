package be.cake.backend.dao;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import org.springframework.data.geo.Point;

/**
 * class that represents a User's address
 * @author manousidou
 *
 */
@Getter
@Setter
@RequiredArgsConstructor
public class Address {

	@NonNull
	private final Point location;
	@NonNull
	private String street;
	@NonNull
	private String zipCode;
	
	
}
