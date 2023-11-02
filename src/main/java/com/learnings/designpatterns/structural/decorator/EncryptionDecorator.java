package com.learnings.designpatterns.structural.decorator;

public class EncryptionDecorator extends BaseDecorator{
    public EncryptionDecorator(Datasource nextLayer) {
        super(nextLayer);
    }

    @Override
    public String read() {
        String value = nextLayer.read();
        return decrypt(value);
    }

    private String decrypt(String value) {
        return "decrypt" + value;
    }

    @Override
    public void write(String value) {
        String encroted = encrypt(value);
    }

    private String encrypt(String value) {
        return
                "return" + "encrypted";
    }
}
