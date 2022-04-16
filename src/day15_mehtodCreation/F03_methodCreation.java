package day15_mehtodCreation;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class F03_methodCreation {
    public static void main(String[] args) {

        //kullacıdan bir keilme isteyin
        //eger kelime 3 harften kısa ise'kelime cok kisa' yazdirin
        // eger kelime 3,4 veya 5 harfliyse harf sayisini ve
        // kelimenin tersten yazilmasini yazdirin
        // eger 5 harften uzunsa'kelime cok uzun' yazdırın


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime girin");
        String kelime = scan.next();
        int harfSayisi = kelime.length();

        if (harfSayisi < 3) {
            System.out.println("kelime cok kisa");

        } else if (harfSayisi == 3) {
            ucHarfiTersineCevir(kelime);
        } else if (harfSayisi == 4) {
            dortHarfiTersineCevir(kelime);
        } else if (harfSayisi == 5) {
            besHarfiTersineCevir(kelime);
        } else {
            System.out.println("kelime cok uzun");
        }
        // 1- method olusturmak icin method'un adını yazariz
        // 2- method'a giderken goturmem gereken variable varsa bunu method'a eklemeliyim
        // 3-

    }

    private static void besHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(4) +
                kelime.substring(3,4) +
                kelime.substring(2,3) +
                kelime.substring(1,2) +
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 5");
        System.out.println("kelimenin tersten yazilisi : " +tersKelime);
    }

    private static void dortHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(3) +
                kelime.substring(2,3) +
                kelime.substring(1,2) +
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 4");
        System.out.println("kelimenin tersten yazilisi : " +tersKelime);
    }


    private static void ucHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(2) +
                             kelime.substring(1, 2) +
                             kelime.substring(0, 1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 3");
        System.out.println("kelimenin tersten yazilisi : " +tersKelime);
    }

}

    
