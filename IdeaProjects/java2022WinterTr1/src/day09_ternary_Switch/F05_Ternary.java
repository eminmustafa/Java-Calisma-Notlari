package day09_ternary_Switch;

public class F05_Ternary {
    public static void main(String[] args) {


        // Bazen ternary'deki iki sonucun daa turleri farkli olabilir

        // verilen sayi 100'den buyukse sayi'nin karesini alip yaziran
        //100'den kucukse "sayi 100'den buyuk olmali" yazdiran
        // bir ternary olusturalim

        int sayi=150;
        // ternary bize sonuc getirdiginde ya sonuc direk yazdirmaliyim
        // veya bir degiskene atamaliyiz
        // eger sonuclar farkli data turlerindeyse
        // atama yapacagimiz veriable'nin data turu  tek olacagindan
        // atama yapamayiz
        // SADECE diretk yazdirabiliriz
        System.out.println(sayi>100 ? sayi*sayi : "sayi 100'den buyuk olmalı");
    }
}
