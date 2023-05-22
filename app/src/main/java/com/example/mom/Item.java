package com.example.mom;

public class Item {
    String sen;
    String[] lan;

    public Item(String sen, String[] lan) {
        this.sen = sen;
        this.lan = lan;
    }

    public String getSen() {
        return sen;
    }

    public void setSen(String sen) {
        this.sen = sen;
    }

    public String[] getLan() {
        return lan;
    }

    public void setLan(String[] lan) {
        this.lan = lan;
    }
}
