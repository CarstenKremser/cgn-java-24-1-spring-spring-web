package de.carstenkremser.neuefische.cgnjava241springspringweb;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/api")
class HelloWorldController {
    List<Message> messages = new ArrayList<>();

    @GetMapping(path = "/hello")
    public String helloGet() {
        return "Hello, World!";
    }
    @GetMapping(path = "/hello/{name}")
    public String helloIdGet(@PathVariable String name) {
        return "Hello, "+name+"!";
    }

    @GetMapping(path="/messages")
    public String messagesGet() {
        return "I got these messages:\n" + messages.toString();
    }

    @PostMapping(path = "/messages/{id}/{name}")
    public String messagesPost(@PathVariable String id,
                           @PathVariable String name,
                           @RequestBody String body) {
        Message message = new Message(id, name, body);
        messages.add(message);
        System.out.println(messages);
        return "Message added: \n" + message;
    }

    @DeleteMapping(path="/messages/{id}")
    public String messagesDelete(@PathVariable String id) {
        Optional<Message> optionalMessage = messages
                .stream()
                .filter(msg -> msg.getId().equals(id))
                .findFirst();
        if (optionalMessage.isPresent()) {
            messages.remove(optionalMessage.get());
            return "Deleted message: \n" + optionalMessage.get();
        }
        return "Message with id "+ id + " not found";
    }
}
