package de.carstenkremser.neuefische.cgnjava241springspringweb;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/api")
class HelloWorldController {
    List<Message> messages = new ArrayList<>();

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello, World!";
    }
    @GetMapping(path = "/hello/{name}")
    public String hello(@PathVariable String name) {
        return "Hello, "+name+"!";
    }

    @GetMapping(path="/messages")
    public String messages() {
        return "I got these messages:\n" + messages.toString();
    }

    @PostMapping(path = "/messages/{id}/{name}")
    public String messages(@PathVariable String id,
                           @PathVariable String name,
                           @RequestBody String body) {
        Message message = new Message(id, name, body);
        messages.add(message);
        System.out.println(messages);
        return "Message added: \n" + message;
    }
}
