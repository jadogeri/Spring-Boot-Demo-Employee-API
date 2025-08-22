package com.example.demo.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class EmployeeConfig {

    @Bean
    CommandLineRunner commandLineRunne(EmployeeRepository repository){
        return args -> {
            Employee joseph = new Employee("Joseph","Adogeri",100, LocalDate.of(2000, Month.AUGUST,5),"josephadogeri@aol.com"
            );
            Employee michael = new Employee("michael","Adogeri",100, LocalDate.of(2000, Month.AUGUST,5),"josephadogeri@aol.com"
            );

            repository.saveAll(
                    List.of(joseph,michael)
            );

        };
    }
}
