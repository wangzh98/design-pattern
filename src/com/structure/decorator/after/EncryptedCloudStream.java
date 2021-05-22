package com.structure.decorator.before;

public class EncryptedCloudStream extends CloudStream {
    @Override
    public void write(String data) {
        String encrypted = encrypt(data);
        super.write(encrypted);
    }

    private String encrypt(String data) {
        return "!$^%&**()(^";
    }
}
