package day18_nestedForLoop;

import java.util.Scanner;

public class F08_ForLoopVsWhileLoop {
    public static void main(String[] args) {

        //kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0!a basincaya kadar devam edin
        // kullanici 0!a bastiginda
        // girdigi tum sayilarin toplamini yazdiiriniz


        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;

        /*
        for (int i = 1; i <1000000; i++) {
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();

            if (sayi==0){
                break;
            }else{
                toplam+=sayi;

            }

        }


         */
        System.out.println(toplam);


        sayi=1;
        toplam=0;

         while (sayi!=0){
             System.out.println("Lutfen bir sayi giriniz");
             sayi = scan.nextInt();
             toplam+=sayi;

         }
        System.out.println(toplam);

         // baslangic, bitis ve degisim degerleri net olan durumlarda forloop daha avantajlidir
         //  ama adim sayisii belli olmayan durumlarda while loop daha avantajlidir





    }
}
