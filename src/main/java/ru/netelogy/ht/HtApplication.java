package ru.netelogy.ht;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HtApplication {

    public static void main(String[] args) {
        SpringApplication.run(HtApplication.class, args);
    }

}
