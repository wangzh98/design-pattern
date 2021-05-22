package com.behavior.wzh.chainOfResopnsibility;

public class Main {
    public static void main(String[] args) {
        Compressor compressor = new Compressor(null);
        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(logger);
        WebServer webServer = new WebServer(authenticator);
        webServer.handle(new HttpRequest("admin", "1234"));

    }
}
