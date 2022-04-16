package day11_stringManipulation;

import java.util.Scanner;

public class F05_indexOf {
    public static void main(String[] args) {

        String str1= "Java bir baska guzel valla cok guzel";
        // istersek char olarak verdigimiz bir harfin index ini dondurur

        System.out.println( str1.indexOf('J')); // 0

        // istersek bir harf yda metin olarak verdigimiz string in indexini dondurur

        System.out.println(str1.indexOf("l")); // 19
        System.out.println(str1.length()-1); // 19
        System.out.println(str1.indexOf("aska"));

        // ayni harften birden fazla varsa ?
        System.out.println(str1.indexOf("b")); // 5 buldugu ilk dogru eslesmenin indexini dondurur

        //

        System.out.println(str1.indexOf('b', 5));
        // bu method'da java aramaya fromIndex olarak yazdigimiz index'den baslar
        //(inclusive)


        // verilen String'deki 2.a harfinin index'ini bulalim
        int ilkindex=str1.indexOf('a'); // 1
        System.out.println(str1.indexOf('a',ilkindex+1)); // 3

        // verilen String'deki 2.b harfinin index'ini bulalim
        int ilkbindex=str1.indexOf("b"); // 3
        System.out.println(str1.indexOf('b',ilkbindex+1)); // 9

        // 20. indexden sonra guzel aratalim
        System.out.println(str1.indexOf("guzel", 20)); // 31


        // String'de olmayan bir garf aratsak

        System.out.println(str1.indexOf("y")); // y yok demesi lazım ama return type'i index
        // yok demenin sayisal karsiligi olarak java -1 dondurmeyi tercih etmistir

        // kullanicidan mail adresini isteyin  @ isareti icermiyorsa gecersiz yazdirin
        // iceriyorsa mailiniz kabul edildi yazdirin


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen mailinizi yaziniz");
        String mail=scan.next();

        if (mail.indexOf("@")==(-1)){
            System.out.println("Gecersiz");
        }else{
            System.out.println("mailiniz kabul edildi");

        }

        // OZET : indexOf method'u icerisine yazilan String vey char'in
        // metinde hangi index'de oldugunu bize dondurur
        // eger aradigimiz metin veya char yoksa, olmadiginin delili olarak
        // bize -1 dondurur







    }
}
