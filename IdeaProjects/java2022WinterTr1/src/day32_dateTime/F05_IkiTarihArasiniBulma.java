package day32_dateTime;

import javax.swing.tree.FixedHeightLayoutCache;
import java.time.LocalDate;
import java.time.Period;

public class F05_IkiTarihArasiniBulma {

    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(1972,01,18);
        System.out.println(Period.between(dogumGunu,bugun)); // P50Y2M15D

        System.out.println(Period.between(dogumGunu,bugun).getYears()); // 50


     // FIXME: 2.04.2022 fixme yazinca direk tarih yazdirdi

    }
}
