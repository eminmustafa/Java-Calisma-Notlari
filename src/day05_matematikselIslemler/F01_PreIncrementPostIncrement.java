package day05_matematikselIslemler;

public class F01_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int sayi=10;
        // bu sayiyi bir artirmak istersek
        sayi++;
        System.out.println(sayi); // 11

        sayi++;
        System.out.println("pre-incrementten once" + sayi); //12
        //eger 11.ve 12. satırda yaptigim islemi tek satırda yaparsam java iki islemden önce hangisini yapacagini bilmek ister

        // once artirir sonra yazdirirsak java yeni degeri yazdırır
        //ama once yazdirir sonra artirirsak bu durumda eski deger yazdirilir

        System.out.println("pre-increment satirinda " + ++sayi); // 13 önce artir sonra yazdır
        System.out.println("pre-incrementden sonra"+sayi);//13


        System.out.println("post-increment satirinda" + sayi++ ); //13 önce yazdır sonra artir
        System.out.println("post increment satirindan sonra" + sayi);// 14

    }
}
