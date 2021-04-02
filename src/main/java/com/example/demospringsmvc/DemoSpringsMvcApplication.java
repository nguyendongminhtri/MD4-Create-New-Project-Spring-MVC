package com.example.demospringsmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpringsMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringsMvcApplication.class, args);
    }
@GetMapping("/hello")
    public String helloCodeGym(@RequestParam(value = "myName",defaultValue = "Word!") String status){

        return String.format("Hello %s!",status);
}


}
