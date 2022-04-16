package day40_overriding_polymorphism;

import java.util.Scanner;

public class F03_Exceptions {
    public static void main(String[] args) {
        // Kullanicidan uku sayi alip, bolerek
        // sonucu yazidrain bir program yaziniz

        Scanner scan = new Scanner(System.in);
        int kontrol=0;
        while (kontrol !=2) {

            System.out.println("Bolmek istediginiz sayiyi yaziniz");
            int sayi1 = scan.nextInt();

            System.out.println("Kaca bolmek istediginizi  yaziniz");
            int sayi2= scan.nextInt();

            try {
                System.out.println("sonuc = " + sayi1 / sayi2);
            } catch (Exception e) {
               // e.printStackTrace();
                System.out.println("Girdiginiz sayilarda sorun var");
            }


            System.out.println("devam etmek icin 1 \nbitirmek icin 2'ye basiniz");
            kontrol=scan.nextInt();

        }


        /*
         sayi2 0 oldugundan  sayi1 / 0 tanimsiz olacagindan
         Java bu durumla karsilasinca exception veiri
         Javanin yazidig mesajda hatanin exception ne tur bir sorun oldugu
         neden kaynaklandigi
         ve hangi satirda olustugu yaza

         Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day40_overriding_polymorphism.F03_Exepcitions.main(F03_Exepcitions.java:19)

	     bunu cozmek icin sayi2'i if ile kontrol edebiliriz


        if (sayi2==0){
            System.out.println("Sayi / 0 tanimsizdir");
        }else{
            System.out.println("sonuc = " + sayi1 / sayi2);

        }
         Ama bu yontem her sorunda calismaz
         */
    }
}
