package com.stuffrental;

import com.stuffrental.model.Stuff;
import com.stuffrental.repository.StuffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    StuffRepository stuffRepository;

    @Override
    public void run(String... strings) {

        for (int i = 0; i <= 13; i++) {
            Stuff stuff = new Stuff();
            stuff.setName("stuff" + i);
            stuff.setPricePerHour(BigDecimal.valueOf(i));
            stuffRepository.save(stuff);
        }

    }
}
