package be.cake.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;

@Configuration
@EnableMongoRepositories(basePackages="be.cake.backend.repository")
@ComponentScan("be.cake.backend.repository")
public class ApplicationConfiguration {

	/*
	 * Factory bean that creates the com.mongodb.Mongo instance
	 */
	public @Bean MongoClientFactoryBean mongo() {

		MongoClientFactoryBean mongo = new MongoClientFactoryBean();

		mongo.setHost("localhost");
		mongo.setPort(27017);
		// mongo.setCredentials(credentials);

		return mongo;
	}
	   
	@Bean
	    public MongoOperations mongoTemplate(Mongo mongo) {
	        return new MongoTemplate(mongo, "cake-store");
	    }
}
