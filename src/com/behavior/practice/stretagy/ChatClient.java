package com.behavior.practice.stretagy;

public class ChatClient {
    // open close principle
    public void send(String message, EncryptionAlgorithm encryptionAlgorithm) {
        encryptionAlgorithm.encrypt();
        System.out.println("Sending the encrypted message...");
    }
}
