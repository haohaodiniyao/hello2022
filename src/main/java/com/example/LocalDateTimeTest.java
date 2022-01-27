package com.example;

import org.joda.time.DateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        ZoneId zoneIdShanghai = ZoneId.of("Asia/Shanghai");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("系统默认时区："+ ZoneId.systemDefault());
        System.out.println("时区列表："+ZoneId.getAvailableZoneIds());
        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println("北京时间1："+now.format(dateTimeFormatter));
        now = LocalDateTime.now(ZoneId.of("UTC"));
        System.out.println("UTC时间："+now.format(dateTimeFormatter));
        //Date转LocalDateTime
        Date today = new Date();
        now = LocalDateTime.ofInstant(today.toInstant(),ZoneId.of("UTC"));
        System.out.println("北京时间2："+now.format(dateTimeFormatter));

        LocalDateTime.of(2022,1,27,3,5,13);
        LocalDateTime.of(2022,2,3,8,0,0);
    }
}
