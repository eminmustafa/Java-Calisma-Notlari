package day16_methatCreation;

public class F02_OverLoading {
    public static void main(String[] args) {




        String str="Bu da gecer ya Huu";
        System.out.println(str.indexOf("d")); // 3
        System.out.println(str.indexOf("a", 5)); // 13
        System.out.println(str.indexOf('a',5));

        // bir class'da ayni isimde birden fazla method olmasına overloading denir
        // ya paramatre sayisi farkli olmalı
        // veya parametre sayisi ayni ise argumentlerin data turleri farkli olmalı
        //

    }
}
