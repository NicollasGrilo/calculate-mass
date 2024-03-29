package br.com.nicollas.calculate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class CalculateMassApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculateMassApplication.class, args);
    }

}
