package com.structure.decorator.before;

public class Main {
    public static void main(String[] args) {
        //CloudStream cloudStream = new CloudStream();
        //cloudStream.write("here is code");
        CloudStream cloudStream = new EncryptedCloudStream();
        cloudStream.write("here is code");

    }
}
