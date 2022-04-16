package day04_dataCasting_Increment;

public class F04_explicitNarrowing {

    public static void main(String[] args) {


        int sayi1= 879;
        double sayi2= 10;

        double sayi3= sayi1/sayi2; // 87.9
        System.out.println(sayi3);

        int sayi4= (int) (sayi1/sayi2) ; //87.9
                                       // deger double,variable int
                                       // yani cariable daha dar dolayisiyla java bunu otomatik yapmaz
                                       // sorumlulugu ustlenmemizi ister
                                       // sag tarafa yazdigimiz (int) sorumluluk bende demek

        System.out.println(sayi4); // 87

        int sayi5= 140;
        byte sayi6=(byte) sayi5; // sag taraftadi int> sol taraftaki variable byte

        System.out.println(sayi6);

        sayi5=520;
        sayi6=(byte) sayi5;
        System.out.println(sayi6); // 8


        sayi5=-130;
        sayi6=(byte) sayi5;
        System.out.println(sayi6); // 126


        sayi5=44;
        sayi6=(byte) sayi5;
        System.out.println(sayi6); // 44





    }
}
