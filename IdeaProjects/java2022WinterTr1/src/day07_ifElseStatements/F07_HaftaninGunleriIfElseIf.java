package day07_ifElseStatements;

import java.util.Scanner;

public class F07_HaftaninGunleriIfElseIf {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // eger kullanıcı gun ismini yanlis girerse "Yanlis giris" yazdiriniz
        // Ornek:  gun=Pazar output = “Hafta sonu”
        //     gun=Sali output = “Hafta ici”
        //*** String icin equals method’unu kullanin

        // pazar veya cumartesi ise ==> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi=scan.next().toLowerCase();

        // hatali girisleri de yazdirmak icin
        // olasiliklari 3' cıkardım
        // hafta sonu- hafta sonu- yanlis giris
        if(gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){

            System.out.println("girdiginiz gun hafta sonu");

        } else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") ||
                gunIsmi.equals("carsamba") ||gunIsmi.equals("persembe") ||
                gunIsmi.equals("cuma")){

            System.out.println("girdiginiz gun hafta ici");


        } else {
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }

        // eger if else if..... statement else ile bitiyorsa olasiliklardan sadece bir tanesi mutlaka calisir
        // Java ilk buldugu true!a ait sonuca yazdirir
        // ve kalan sartlara bakmaz

        // if else if.... cumleleri else ile bitmesede calisir
        // ancak bu durumda sadece bir olasilik calisabilir VEYA hic bir islem yapilmayabilir



    }
}
