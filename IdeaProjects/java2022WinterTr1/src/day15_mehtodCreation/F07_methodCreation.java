package day15_mehtodCreation;

public class F07_methodCreation {
    public static void main(String[] args) {


        // string'i yazdiran bir method olusturalım
        // hosgeldiniz diyen bir method olusturunuz
        // kapanma mesajı yazan bir method olusturunuz

        hosgeldinYazdir();
    }
    public static void kapanmaMethodu() {
        System.out.println("bizi tercih ettiginiz icin tesekkur ederiz");
    }
    public static void hosgeldinYazdir() {
        System.out.println("hosgeldin");
        stringYazdir("Boylede olur");
    }
    public static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}
