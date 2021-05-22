package com.behavior.practice.stretagy;

public class Main {
    public static void main(String[] args) {
        ChatClient chatClient = new ChatClient();
        chatClient.send("new message", new AesAlgorithm());
        chatClient.send("new message2", new DesAlgorithm());
    }
}
