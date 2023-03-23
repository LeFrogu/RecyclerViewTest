package com.example.recyclerviewtest;

public class MailModel {
    String mailHeader;
    String mailInfo;
    int image;

    public MailModel(String mailHeader, String mailInfo, int image) {
        this.mailHeader = mailHeader;
        this.mailInfo = mailInfo;
        this.image = image;
    }

    public String getMailHeader() {
        return mailHeader;
    }

    public String getMailInfo() {
        return mailInfo;
    }

    public int getImage() {
        return image;
    }
}
