package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Bob = new Student(
                    "Bob",
                    "bob@bob.bob",
                    LocalDate.of(2000, Month.JANUARY,5)
            );

            Student BobTheSecond = new Student(
                    "Bobthesecond",
                    "bobthesecond@bob.bob",
                    LocalDate.of(2000, Month.JANUARY,6)
            );

            repository.saveAll(List.of(Bob, BobTheSecond));
        };
    }
}
