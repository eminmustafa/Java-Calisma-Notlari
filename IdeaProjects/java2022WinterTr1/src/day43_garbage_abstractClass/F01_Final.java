package day43_garbage_abstractClass;

public class F01_Final {

    final  static double piSayisi=3.14;
    final static  String okulIsmi="Yildiz Koleji";

    public static void main(String[] args) {

        final int sayi=10;
        // okulIsmi="Java Koleji";  final olarak isaretlendigi icin degistirilemez.

    }


    public final static    void  method1(){
        System.out.println("Parent class final method1");
    }

}
