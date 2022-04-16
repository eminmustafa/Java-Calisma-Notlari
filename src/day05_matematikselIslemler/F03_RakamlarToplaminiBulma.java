package day05_matematikselIslemler;

import java.util.Scanner;

public class F03_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        // kullanicidan aldiginiz 4 basamakli bir sayinin
        // basamaklardaki rakamlar toplamini bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir tam sayi girriniz");
        int sayi=scan.nextInt();


        int rakam=0;
        int rakamlarToplami=0;
        //1. adim rakam=0 rakamlar toplamı=0 sayi=7532

        rakam=sayi%10; //2
        rakamlarToplami +=rakam; // 2
        sayi/=10; // 753

        //2. adima gecerken rakam=2 rakamlar toplami=2 sayi=753

        rakam=sayi%10; // 3
        rakamlarToplami += rakam; // 5
        sayi /=10; // 75

        // 3. adim rakam=3 rakamlar toplami=5 sayi=75

        rakam=sayi%10;// 5
        rakamlarToplami +=rakam; // 10
        sayi /=10;// 7

        rakam=sayi%10; // 7
        rakamlarToplami+=rakam; // 17
        sayi /=10; // 0

        System.out.println("girdiginiz sayinin rakamlar toplami" + rakamlarToplami);


    }
}
