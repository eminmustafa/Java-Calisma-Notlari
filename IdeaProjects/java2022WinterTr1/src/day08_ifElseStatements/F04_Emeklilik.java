package day08_ifElseifStatements;
import java.util.Scanner;
public class F04_Emeklilik {
    public static void main(String[] args) {
        //nested, ic ice demek
        //eger calisan kadinsa 60 yasindan buyukse emekli oloabnlir
        // erkekse 65 yasindan buyukse emekli olabilir
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz " +
                "\nkadin icin K, \nErkek icin E harfini giriniz"); // \n alt satira gecirir
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        // ilkkelime.buyukharf.ilkkarakter;
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();
        if (cinsiyet == 'K') {                         //erkek kadin ayrimini once if else ile yap
            if (yas < 0 || yas > 120) {
                System.out.println("Lutfen yasinizi kontrol ediniz");
            } else if (yas < 60) {
                System.out.println("Emekli olamazsin.\n Daha" + (60 - yas) + " yil daha calismalisin.");
            } else {
                System.out.println("Emekli oabilirsin");
            }
        } else if (cinsiyet == 'E') {
            if (yas < 0 || yas > 120) {
                System.out.println("Lutfen yasinizi kontrol ediniz");
            } else if (yas < 65) {
                System.out.println("Emekli olamazsin.\n Daha" + (65 - yas) + " yil daha calismalisin.");
            } else {
                System.out.println("Emekli oabilirsin");
            }
        } else {
            System.out.println("Cinsiyet icin gecerli bir harf giriniz");
        }
        //emine yazarsak ilk harfi alip erkek olarak kabul eder.

    }
}






















































































