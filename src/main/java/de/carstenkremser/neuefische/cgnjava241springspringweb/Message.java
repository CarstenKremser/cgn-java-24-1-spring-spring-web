package de.carstenkremser.neuefische.cgnjava241springspringweb;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Message {
    private String id;
    private String name;
    private String message;
}
