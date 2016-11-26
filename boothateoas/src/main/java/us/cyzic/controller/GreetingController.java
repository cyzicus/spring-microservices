package us.cyzic.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import us.cyzic.model.Greet;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    @ResponseBody
    public HttpEntity<Greet> greeting(@RequestParam(value = "name",
            required = false, defaultValue = "HATEOAS") String name) {

        Greet greet = new Greet("Hello " + name);

        greet.add(linkTo(methodOn(GreetingController.class).greeting(name)).withSelfRel());

        return new ResponseEntity<Greet>(greet, HttpStatus.OK);

    }


}
