package day04_dataCasting_Increment;

public class F05_IncrementDecrement {


    public static void main(String[] args) {
        int  sayi=20;

        System.out.println(sayi+10); // 30
         // bu satırda sayıyı 10 artırmadım
        // sayinin 10 fazlasını yazdirdim

        System.out.println(sayi); // 20

        // eger atama yapmazsak sayida yaptigimizartirma veya azaltma kalıcı olmaz

        sayi=sayi+10;
        System.out.println(sayi); // 30

        System.out.println(sayi =sayi+=10); // 40

        System.out.println(sayi); // 40


        System.out.println(sayi+=10); //50
        System.out.println(sayi); //50

        //bir variable'in degerini kalıcı olarak artırmak veya azaltmak isterseniz assignment sarttir

        System.out.println("30.satir :" +  sayi++); // 50
        System.out.println("21.satir :" + sayi); //51


        System.out.println("34.satir :" + ++sayi); //52
        System.out.println("35.satir :" + sayi); // 52





    }
}
