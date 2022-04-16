package day10_Switch_StringManipulation;

import java.util.Scanner;

public class F01_SwitchCase {
    public static void main(String[] args) {
        //kullanicadan  sayi olarak kacinci ay oldugunu alip
        //istenen ay ismini yazdiran bir program yaziniz


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu giriniz");
        int ayNo=scan.nextInt();

        //bu soruyu if else ile yapabilirliz ama art arda 12 if else
        // cok kalabalik ve anlasilmasi cok guc olabilir
        // bunun yerine switch-case yapisini kullanabiliriz

        switch (ayNo){

            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Lutfen gecerli bir ay numarasi giriniz");

        }
        // switch icine yazilan  variable'in degerine gore
        // ilgili case'yi bulur ve break gorene kadar kodu calistirir
        // eger break yoksa ilgili case'den assagi dogru tum case'ler calisir
        // if else'deki gibi son else gibi, geriye kaandurumlari
        // tamamen kapsayacak bir satir daha ekleyebiliriz

    }
}
