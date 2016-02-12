package be.cake.backend.repository;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import be.cake.backend.config.ApplicationConfiguration;
import be.cake.backend.dao.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationConfiguration.class)
public class CRUDRepositoryTest {

	static final Logger LOGGER = LoggerFactory.getLogger(CRUDRepositoryTest.class);
	  
	
	@Autowired
	private UserRepository userRepository;
	
	@Before
	public void setUp() {
		
		userRepository.deleteAll();
				
		userRepository.save(new User("userName_1"));
		
		LOGGER.debug("Saved entity");
	}
	
	/**
	 * Test case to show that automatically generated ids are assigned to the domain objects.
	 */
	@Test
	public void setsIdOnSave() {

		User user = userRepository.save(new User("Dave"));
		assertThat(user.getId(), is(notNullValue()));
	}
}
