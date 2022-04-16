package day18_nestedForLoop;

import java.util.Scanner;

public class F07_whileLoop {
    public static void main(String[] args) {
        // kullanicidan kac sayi toplamak istedigini alın
        // bu sayilari alin ve bu sayilarin toplamini ekrana yaziriniz

        int sayiAdedi = 3;


        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;


        for (int i = 1; i <= sayiAdedi; i++) {
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;

        }
        System.out.println("Girilen " + sayiAdedi + " sayinin toplami : " + toplam);

        // while ile yapalim
        sayi = 0;
        toplam = 0;
        int sayac = 1;

        while (sayac <= sayiAdedi) ;
        {

            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
            sayac++;
        }


            System.out.println("Girilen "+ sayiAdedi + " sayinin toplami : " + toplam);


    }
}
