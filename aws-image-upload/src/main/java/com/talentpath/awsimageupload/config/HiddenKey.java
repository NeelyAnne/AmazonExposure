package com.talentpath.awsimageupload.config;

public class HiddenKey {
    private String publicKey;
    private String privateKey;

    public HiddenKey() {
       
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }
}
