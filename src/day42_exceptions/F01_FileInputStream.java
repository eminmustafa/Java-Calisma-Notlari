package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class F01_FileInputStream {
    public static void main(String[] args) {

        String dosyaYolu="src/day41_exceptions/dosya";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            int k=0;
            while ( (k=fis.read()) != -1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
             Exception'lar icinde parent child iliskisi mevcuttur
             Eger bir kod icin birden fazla exception olusma ihtimali varsa
             Oncelikle olasi exception'lar parent=child ilisksii tasiyor mu bakmamiz gerekiyor
             eger parent-child iliskisi yoksa istedigimiz sirada cath cumleleri olusturabiliriz

             eger parent-child iliskisi varsa
             sadece parent exceptions'u yazabilirz
             veya ikisinide yazmak istersek
             child'i once parent'i sonra yazmaliyiz
         */

        /*
             Alti kirmizi cizlgili her kod CTE degildir
             Java syntax hatalarini derleme esnasinda(compile) farkeder ve altini cizer
             biz bu gune kadar tamamnina CTE duyorduk ancak
             exception konusu ile birlikte
             Compile Time Exception kavrami da hayatimiza girdi
         */

    }
}
