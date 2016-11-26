package us.cyzic.bootrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import us.cyzic.bootrest.model.Greet;

/**
 * Created by jasoncmiller on 11/25/16.
 */
@RestController
public class GreetingController {

    @GetMapping("/")
    public Greet greet() {
        return new Greet("Hello World!");
    }


}
