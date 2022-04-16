package day30_passByValue;

import day29_StaticKeyword.F01_Static;

public class F01_StaticBlocks {

    static{
        /*
        static block class ilk calismayabasladiginda devreye girer
        ve class'in calismasi icin gerekli on hazirliklar icin kullanilir
        yazıldigi satirin hicbir onemi yoktur, class icerinde istenenn yerde yazilabir
        static block birden fazla olursa block'lar yukaridan asagi dogru sirayla calisir
         */

        System.out.println("satatic block1 calisti");
    }
    static{
        System.out.println("satatic block2 calisti");
    }

    F01_StaticBlocks(){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method baslangici");
        F01_StaticBlocks obj1;
        new F01_StaticBlocks();
        System.out.println("main method sonu");


    }

}
