package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class H_sayiBulmaca {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayi buyut veya kucult diye kullanicicya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullanicviya yazdirin

        Random rnd=new Random();
        int sayi=rnd.nextInt(100); // buarasi 100'den kucuk rastgele bir sayi olusturur

        Scanner scan= new Scanner(System.in);
        int tahmin=0;
        int sayac=1;

        while (sayi !=tahmin){
            System.out.println("Lutfen bir sayi giriniz");
            tahmin=scan.nextInt();

            if (tahmin>sayi){
                System.out.println("Daha kucuk bir sayi soylemelisin");


            }else if (tahmin<sayi){
                System.out.println("Daha buyuk bir sayi soylemelisin");

            }
            sayac++;


        }
        System.out.println("Tuttugum sayiyi" + (sayac-1)+ " tahminde buldunuz");



    }
}
