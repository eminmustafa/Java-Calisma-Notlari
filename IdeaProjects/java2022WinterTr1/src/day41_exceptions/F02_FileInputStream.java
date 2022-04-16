package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class F02_FileInputStream {
    public static void main(String[] args)  {
        /*
            Bir kod yazilirken olasi exception'lar on gorulup
            exception olustugunda Javanin ne yapmasini istedigimiz
            belirtilmelidir.

            1- Eger exception olustugunda kod'un calismaya devam etmesini istemiyorsak
               method isminin yanina olusabilecek exception'i deklare edebiliriz
            2- Eger exception olursa da kodun calismaya devam etmesini istiyorsak
               sorun olusturabilecek kodu rty catch blogunun icine alir
               try bloguna  sroun cikabilecke kodu
               catch bloguna olsabilecek exception'i ve
               oalsu exception durumunda Jacanin ne yapsini istedeigimizi yazabiliriz

         */

        String dosyaYolu="src/day41_exceptions/dosya";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

