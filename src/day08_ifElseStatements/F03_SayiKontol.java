package day08_ifElseStatements;

import java.util.Scanner;

public class F03_SayiKontol {
    public static void main(String[] args) {
        //Kullanicidan iki sayi isteyin,
        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        //sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
        // sayilarin ikisi farkli isaretlere sahipse
        // "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
        //sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        //sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin
        if (sayi1>0 && sayi2>0){
            System.out.println("girdiginiz iki sayida pozitif oldugunda toplamlari=" +
                    (sayi1+sayi2));
        } else if (sayi1<0 && sayi2<0) {
            //sayilarin ikisi de negative ise sayilarin carpimini yazdirin
            System.out.println("girdiginiz iki sayida negatif oldugunda carpimlari=" +
                    (sayi1 * sayi2));
        } else if (sayi1*sayi2<0) {
            // sayilarin ikisi farkli isaretlere sahipse
            // "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
        } else {
            System.out.println("sifir carpmaya gore yutan elemandir");
        }

    }

}
