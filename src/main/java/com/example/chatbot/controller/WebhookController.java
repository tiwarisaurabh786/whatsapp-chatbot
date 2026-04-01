package com.example.chatbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.chatbot.model.MessageRequest;
import com.example.chatbot.model.MessageResponse;
import com.example.chatbot.service.ChatService;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @Autowired
    private ChatService chatService;

    @PostMapping
    public MessageResponse receive(@RequestBody MessageRequest request) {

        System.out.println("Incoming message: " + request.getMessage());

        String reply = chatService.getReply(request.getMessage());

        return new MessageResponse(reply, LocalDateTime.now().toString());
    }
}