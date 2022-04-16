package day32_dateTime;

import java.time.LocalTime;

public class F02_LocalTime {

    public static void main(String[] args) {

        LocalTime tm=LocalTime.now();
        System.out.println(tm); // 00:33:24.386422
        // bir islemin ne kadar surede bittigini bulmak istersek
        // islemden once ve sonra birer time objesi olusturup
        // aradaki farki hesaplayabiliriz
        int sayi=0;
        for (int i = 0; i < 100000; i++) {
            sayi+=i;
        }
        LocalTime tmLoopSonrasi=LocalTime.now();
        System.out.println(tmLoopSonrasi); // 00:36:42.420206300

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();

        System.out.println("islem " + (nano2-nano1) + " nanosaniyede bitti");


        // ileri veya geriye gidebiliriz
        System.out.println(tm.plusMinutes(1000)); // 17:20:51.307209500

        // istersek zone id kullanarak istedigimiz bolgenin saati icin de obje olusturabiliriz

    }
}
