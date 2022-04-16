package day06_Concatenation_Oparators;

public class F02_Mantikoperatorleri {
    public static void main(String[] args) {


        System.out.println(5+2==8);//false

        boolean sonuc1=5>4 && 7<9&& 6+3==9 && 5+2!=8 ; // true


        System.out.println(sonuc1); // true


        boolean sonuc2= 5>4 && 7>9&& 6+3==9 && 5+2!=8 ; // false

        System.out.println(sonuc2); // false


        boolean sonuc3= 5>4 & 7>9 & 6+3==9 & 5+2!=8 ; // false



        System.out.println(sonuc3);


        // && ile& arasindaki fark


        int sayi3= 15;

        // sayi3'ün' 10 ile 20 arasliginda oldugunu true diyerek dondurelim
        // Java 3'lü karşilartirma kabul etmez
        // 2'li karsilastirmalar yapip mantiksal operatorlerle birlestirmeliyiz


        System.out.println(10<sayi3   &&   sayi3<20); // true

        int sayi4=5;
        // sayi4'ün 10 ile 20'in arasinda olmadigini true diyerek dondurelim

        System.out.println(sayi4<10 || sayi4>20); // true






    }
}
