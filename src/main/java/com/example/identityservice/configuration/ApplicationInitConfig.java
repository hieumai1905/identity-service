package com.example.identityservice.configuration;

import com.example.identityservice.entity.User;
import com.example.identityservice.enums.Role;
import com.example.identityservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Set;

@Slf4j
@Configuration
@RequiredArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
public class ApplicationInitConfig {

    PasswordEncoder passwordEncoder;

    @Bean
    ApplicationRunner applicationRunner(UserRepository userRepository) {
        return args -> {
            // Add some initial data here
            if (userRepository.findByUsername("admin").isEmpty()) {
                // Add admin user
                User admin = User.builder()
                        .username("admin")
                        .password(passwordEncoder.encode("admin"))
                        .roles(Set.of(Role.ADMIN.name()))
                        .build();
                userRepository.save(admin);
                log.warn("Admin user has been create with default password: admin, please change it immediately");
            }
        };
    }
}
