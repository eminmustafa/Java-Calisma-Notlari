package day39_overriding;

import day27_constructor.ToyotaRunner;

import javax.swing.*;
import java.util.Collection;

public class Corolla extends Toyota {

    protected String hiz="Corolla max 200 km hiz yapar";
    protected String yakit="Corolla benzinli veya elektriklidir";
    protected  String model="Corolla";

    public void  motor(){
        System.out.println("Corolla araclar cevreci motor kullanir");
    }

    public void  yakitTuketimi(){
        System.out.println("Corolla 5.6 lt yakit tuketir");

    }

    public  void  vitesSayisi(){
        System.out.println("Corolla 5 viteslidir");

    }

    public static void main(String[] args) {

        /*
         Data turu ve contructor farkli oldugundan
         constructor  calistigi icin obje
         constructor'in oldugu class ozelliklerini tasir
         ancak data turu Parent class secildigi icin
         variable'le adata turunun secildigi class ve
         onun parent class'laridan deger alabilir

         method'lar icin ise yeni data turunun odlugu class'a gideriz
         ancak direkk methodu calisrmadan once
         method Ovirride edilmis mi diye kontrol ederiz
         */



        Corolla arb1= new Corolla();
        System.out.println(arb1.hareket); // araba class'idan aliriz
        System.out.println(arb1.hiz); // Corolla class'indan alir
        System.out.println(arb1.yakit); // Corolla class'indan alir
        System.out.println(arb1.marka); // Toyota class'idnan alir
        System.out.println(arb1.sirketMerkezi); // Toyota class'idnan alir
        System.out.println(arb1.model); // Corolla class'indan alir
        arb1.motor(); // Corolla class'indan ali



        Toyota arb2= new Corolla();
        System.out.println(arb2.hareket); // araba class'idan alir
        System.out.println(arb2.hiz); // Toyota class'indan alir
        System.out.println(arb2.yakit); // Araba class'indan alir
        System.out.println(arb2.marka); // Toyota class'idnan alir
        System.out.println(arb2.sirketMerkezi); // Toyota class'idnan alir
        //System.out.println(arb2.model); // CTE verir
        arb2.motor(); // Corolla class'indan alir
        arb2.garanti(); // Toyota class'indan alir
        arb2.yakitTuketimi(); // overriding ile Corolla class'indan alir
        // arb2.vitesSayisi(); data turu olan toyota'dan
        //baslayinca boyle bir method bulamadik
        // dolayisiyla CTE



        Araba arb3= new Corolla();
        System.out.println(arb3.hareket); // araba class'idan aliriz
        System.out.println(arb3.hiz); // Araba class'indan alir
        System.out.println(arb3.yakit); // Araba class'indan alir
        System.out.println(arb3.marka); // Araba class'idnan alir
        //System.out.println(arb3.sirketMerkezi); // CTE verir
        //System.out.println(arb3.model); // CTE verir
        arb3.yakitTuketimi(); // Override ile Corolla class'indan alir
        arb3.motor(); // Override ile Corolla class'indan alir
        // arb3.garanti(); // CTE aramaya araba class'indan basladi ve methodu bulamadi .

        // arb3.vitesSayisi(); // CTE




    }
}
