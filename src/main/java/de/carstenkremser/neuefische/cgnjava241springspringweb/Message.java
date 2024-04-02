package de.carstenkremser.neuefische.cgnjava241springspringweb;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Message {
    private String name;
    private String message;
    private String id;
}
