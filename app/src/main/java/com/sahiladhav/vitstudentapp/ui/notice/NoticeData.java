package com.sahiladhav.vitstudentapp.ui.notice;

public class NoticeData {

    String title, image, date, time, key;


    public NoticeData() {

    }

    public NoticeData(String title, String image, String date, String time, String key) {
        this.title = title;
        this.image = image;
        this.date = date;
        this.time = time;
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getKey() {
        return key;
    }
}
