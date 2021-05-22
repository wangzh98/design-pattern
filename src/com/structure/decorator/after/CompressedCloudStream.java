package com.structure.decorator.before;

public class CompressedCloudStream extends CloudStream {
    @Override
    public void write(String data) {
        String compress = compress(data);
        super.write(compress);
    }

    private String compress(String data) {
        return data.substring(0, 5);
    }
}
