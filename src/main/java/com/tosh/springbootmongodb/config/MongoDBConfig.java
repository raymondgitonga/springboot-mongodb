package com.tosh.springbootmongodb.config;

import com.tosh.springbootmongodb.document.Users;
import com.tosh.springbootmongodb.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){
        return strings-> {
            userRepository.save(new Users(1, "Tosh", "Core", 20_000L));
            userRepository.save(new Users(1, "Tosh", "Core", 20_000L));
        };
    }
}
