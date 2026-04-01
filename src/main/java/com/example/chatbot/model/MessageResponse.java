package com.example.chatbot.model;

public class MessageResponse {
    private String reply;
    private String time;

    public MessageResponse(String reply, String time) {
        this.reply = reply;
        this.time = time;
    }

    public String getReply() {
        return reply;
    }

    public String getTime() {
        return time;
    }
}