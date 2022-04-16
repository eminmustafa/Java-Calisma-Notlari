package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class F01_LocalDate {
    public static void main(String[] args) {

        LocalDate trh = LocalDate.now(); // objenin olusturuldugu tarihi yazar trh'ye atar
        LocalDate baskatrh=LocalDate.of(1972,1,18);
        // istedigimiz yil,ay ve gun degerlerine gore bize obje olusturur

        System.out.println(trh); // 2022-04-02
        // get'li method'larda tarih ile ilgili detay bilgileri alabiliriz
        System.out.println(trh.getDayOfMonth()); // 2 objenin olusturuldugu tarihin ayin gununu verir
        System.out.println(trh.getDayOfWeek()); // SATURDAY haftanin hangi gununu verir
        System.out.println(trh.getMonthValue()); // 4 hangi ay
        System.out.println(trh.getYear()); // 2022 yili verir

        // bir tarihden istedigimiz kadar ileri veya geri gidebiliriz

        System.out.println(trh.minusWeeks(20)); // 2021-11-13 20 hafta geri tarihini verdi
        System.out.println(trh.minusWeeks(5).minusDays(3)); // 2022-02-23

        System.out.println(trh.plusMonths(9).plusDays(10)); // 2023-01-12

        // istedigimiz ulkenin o andaki tarihini elde etmek istersek
        LocalDate trhZone= LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone); //  2022-04-02

        // is ile baslayan method'lar boolean sonuclar dondurur
        System.out.println(LocalDate.now().isLeapYear()); // false
        System.out.println(trh.isAfter(baskatrh)); // true





    }
}
