package com.example.chatbot.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String getReply(String message) {

        if (message == null || message.trim().isEmpty()) {
            return "Please send a valid message.";
        }

        message = message.trim().toLowerCase();

        if (message.contains("hi")) {
            return "Hello";
        } else if (message.contains("bye")) {
            return "Goodbye";
        } else if (message.contains("how are you")) {
            return "I'm fine";
        } else if (message.contains("help")) {
            return "Try: Hi, Bye, How are you";
        } else {
            return "Sorry, I didn't understand.";
        }
    }
}