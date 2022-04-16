package day32_dateTime;

import java.time.LocalDateTime;

public class F03_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime tarihsaat=LocalDateTime.now();
        System.out.println(tarihsaat); // 2022-04-02T00:49:46.189016700

        System.out.println(tarihsaat.plusYears(3).plusMonths(2).plusDays(10).plusHours(5).plusMinutes(5)); // 2025-06-12T05:56:42.053089100

    }
}
