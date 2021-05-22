package com.structure.facade;

public class Main {
    public static void main(String[] args) {
        NotificationServer server = new NotificationServer();
        Connection connection = server.connect("ip");
        AuthToken authenticate = server.authenticate("appId", "key");
        Message message = new Message("Hello World");
        server.send(authenticate, message, "target");
        connection.disconnect();
    }
}
