package day34_accessModifier_encapsulation;

public class F01 {
    private  static int sayi=10;
    private  static String str="Java";
    static int acikSayi=20; // access modifier'i  default access modifier
    String acikString="Hi"; // access modifier'i  default access modifier
    public static int halkaAcikSayi=15;
    protected static int aileyeOzel=40;
    protected F01(){
        // bu constructor'in access modifier'i
        // default access modifier'dir
        // dolayisiyla icinde oldugunumz paketin disinda
        // bu class'dan obje olusturulamaz


    }

    private F01(int nuamra){
        System.out.println("paramtreli constructor calisti");

    }


    private void method1(){

    }

}
