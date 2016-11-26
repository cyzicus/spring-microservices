package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jasoncmiller on 11/25/16.
 */

@RestController
public class HomeController {

    @GetMapping("/")
    public Greet sayHello() {
        return new Greet("Hello World!");
    }

    class Greet {
        private String message;

        public Greet(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
