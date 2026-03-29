package ru.Kirill.app;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class UserMessage {
    private String userName;
    private String messageContent;
}