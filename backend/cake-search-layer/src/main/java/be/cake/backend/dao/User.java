package be.cake.backend.dao;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Representation of the user entity
 * @author manousidou
 *
 */
@Document
@Data
@NoArgsConstructor
@TypeAlias("User")
public class User {

	@Id
	private String id;
	
	@NonNull
	private String userName;
	
	@NonNull
	private Date userSince;
	
	private String address;
	
	private String phone;
	
	public User(String userName) {
		this.userName = userName;
	}
	
}
