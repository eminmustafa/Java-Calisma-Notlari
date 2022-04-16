package day04_dataCasting_Increment;

public class F03_Casting {

    public static void main(String[] args) {

        int sayi1= 8;
        int  sayi2=4;
        System.out.println(sayi1/sayi2);


        sayi2=3 ;

        System.out.println(sayi1/sayi2); // 2.66666=> 2

        sayi1=22;

        System.out.println(sayi1/sayi2); // 7.33333>=7

         //java iki integer sayiyi birbirine bolerse sonucu da integer olarak verir
        // eger virgulden sonra kusurat varsa siler yuvarlama yapmıyor



        sayi1=4786;
        sayi2=10;

        sayi1=sayi1/sayi2 ;


        System.out.println(sayi1); // 478 .6

        sayi1=sayi1/sayi2 ;


        System.out.println(sayi1); // 47

        sayi1=sayi1/sayi2 ;


        System.out.println(sayi1); // 4


        sayi1=sayi1/sayi2 ;


        System.out.println(sayi1); // 0

        sayi1=4895;

        double sayi3=10;

         //sayi1=sayi1/sayi3; // java iki sarkli sayi data turunu isleme koydumuzda
                           // java kucuk olan data turu icin autoWidenin yaoar
                           // bu islemi dusunursek sayi1/sayi3 = > islemin sonucunu dauble kabul eder

        System.out.println(sayi1/sayi3); // 489.5

        System.out.println(sayi3/sayi1); // 0.002042900919354137




















    }
}
