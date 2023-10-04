package dev.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CharacterController {

    @RequestMapping(value = "/characters", method = RequestMethod.GET)
    public String getMessage() {
        return "Hello World";
    }
}
