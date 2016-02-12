package be.cake.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import be.cake.backend.dao.User;

/**User repository interface
 * @author manousidou
 *
 */
public interface UserRepository extends MongoRepository<User, String>{

	public User findUserByUserName(String userName);
	
}
