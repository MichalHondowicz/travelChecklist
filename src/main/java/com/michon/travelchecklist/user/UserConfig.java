package com.michon.travelchecklist.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args -> {
            var user = new User();
            user.setName("Test");
            repository.saveAll(List.of(user));
        };
    }
}
