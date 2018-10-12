package com.mongo.springbootmongodb.config;

import com.mongo.springbootmongodb.document.User;
import com.mongo.springbootmongodb.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){
        return strings -> {
            userRepository.save(new User(1, "Palak", "MDS", 300L));
            userRepository.save(new User(2, "Pranav", "MDS", 300L));
        };
    }

}
