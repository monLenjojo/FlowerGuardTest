package com.example.user1801.flowerguard.firebaseThing;

public class JavaBeanSetAllDeviceList {
    private String key;
    private String onUsed;
    private String mac;

    public JavaBeanSetAllDeviceList() {
    }

    public JavaBeanSetAllDeviceList(String key, String onUsed, String mac) {
        this.key = key;
        this.onUsed = onUsed;
        this.mac = mac;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getOnUsed() {
        return onUsed;
    }

    public void setOnUsed(String onUsed) {
        this.onUsed = onUsed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}