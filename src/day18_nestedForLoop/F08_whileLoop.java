package day18_nestedForLoop;

import java.util.Scanner;

public class F08_whileLoop {
    public static void main(String[] args) {

        //kullancidan istedigi kadar sayi gitmesini isteyin
        // kullanicinin giridigi sayi sayilarin toplami 500' gecerse
        // artik yeter cok sayi girdin, toplam ..... oldu yazsin

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;

        while (toplam<500){
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam+=sayi;
        }

        System.out.println("artik yeter cok sayi girdin, toplam  : " +toplam+ " oldu");

    }
}
