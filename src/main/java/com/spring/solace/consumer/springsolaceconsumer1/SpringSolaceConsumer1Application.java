package com.spring.solace.consumer.springsolaceconsumer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringSolaceConsumer1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringSolaceConsumer1Application.class, args);
    }


    @PostMapping("/rest/tutorials")
    public String sayHello()  {
        return "Hello From Spring and Kubernetes example";
    }

    @GetMapping(value="/rest/tutorials")
    public ResponseEntity getHello()  {
        Person person = new Person("Consumer2");
        return new ResponseEntity(person, HttpStatus.OK);
    }


    class Person {
        public String getName() {
            return name;
        }

        String name;

        Person(String name) {
            this.name = name;
        }
    }
}
