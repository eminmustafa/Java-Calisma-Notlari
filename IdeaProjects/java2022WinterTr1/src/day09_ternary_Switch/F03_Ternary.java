package day09_ternary_Switch;

public class F03_Ternary {
    public static void main(String[] args) {

        int sayi=140;
        // verilen sayinin 3 veya daha cok basamakli olup olmadigini kontrol
        // ve sonucu yazdiran bir ternary olusturun

        String sonuc =sayi>=100 ? "Sayi 3 basamakli veya daha buyuk" : "sayi negatif veya 3 basamakdan kucuk";


        // Ternary bize sonuc dondurdugu icin
        // ya bu sonucu direkt yazdirmaliyiz
        // yada sonucan data turune  uygun bir variable atayabiliriz

        System.out.println("girdiginiz sayi analizi : " + sonuc);








    }
}
