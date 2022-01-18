package com.example.test;

import org.joda.time.DateTime;

import java.util.Date;

public class MyTest {
    public static void main(String[] args) {
        Date date = new Date();
        DateTime dateTime = new DateTime(date);
        System.out.println(dateTime.minusDays(1).toString("yyyy-MM-dd HH:mm:ss"));
    }
}
