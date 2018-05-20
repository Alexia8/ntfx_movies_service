package com.alexiacdura.ntfxmoviesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by alexiacdura 13/05/2018
 *
 * @author Alexia C. Durá
 */

/**
 * Identify JPA repository in project
 */
@EnableJpaRepositories(basePackages = "com.alexiacdura.ntfxmoviesservice.repository")
/**
 * Enable spring boot application
 */
@SpringBootApplication
public class NtfxMoviesServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NtfxMoviesServiceApplication.class, args);
    }
}
