package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//Aqui é feito a introdução de dados no BD

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args ->{
            Student mario = new Student(
                    "Mario",
                    "mario@",
                    LocalDate.of(2020, Month.AUGUST, 3)
            );

            Student carle = new Student(
                    "Carle",
                    "carle@",
                    LocalDate.of(2004, Month.AUGUST, 3)
            );

            repository.saveAll(
                    List.of(mario, carle)
            );
        };
    }
}
