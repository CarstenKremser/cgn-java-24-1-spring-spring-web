package de.carstenkremser.neuefische.cgnjava241springspringweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
class HelloWorldController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello, World!";
    }
}
