package com.structure.facade;

public class NotificationServer {
    // connect() -> Connection
    // authenticate(appID, key) -> AuthToken

    public Connection connect(String ipAddress) {
        return new Connection();
    }

    public AuthToken authenticate(String appId, String key) {
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String target) {
        System.out.println("Sending a message");
    }

}
