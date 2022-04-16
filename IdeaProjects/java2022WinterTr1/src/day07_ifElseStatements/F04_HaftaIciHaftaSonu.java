package day07_ifElseStatements;

import java.util.Scanner;

public class F04_HaftaIciHaftaSonu {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // Ornek:  gun=Pazar output = “Hafta sonu”
        //     gun=Sali output = “Hafta ici”
        //*** String icin equals method’unu kullanin

        // pazar veya cumartesi ise ==> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici


        // String case sensitive'dir
        //yani pazar,PAZAR,PAzar bunlar hep farkli kelimelerdir

        // bu durumda String methodlarıdnan yardim alırız

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi=scan.next().toLowerCase(); // kullanici nasil yazarsa biz kucuk harfe ceviriyoruz


        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("girdiginiz gun hafta sonu");
        }
        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") ||
        gunIsmi.equals("carsamba") ||gunIsmi.equals("persembe") ||
        gunIsmi.equals("cuma")){
            System.out.println("girdiginiz gun hafta ici");
        }
    }
}
