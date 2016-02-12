package be.cake.backend.dao;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import org.springframework.data.geo.Point;

/**
 * class that represents a User's address
 * @author manousidou
 *
 */
@Getter
@RequiredArgsConstructor
public class Address {


	private final Point location;
	private String street;
	private String zipCode;
	
	
}
