package day09_ternary_Switch;

import java.util.Scanner;

public class F02_Ternary {
    public static void main(String[] args) {

        // Ternary ile yapılan tum islemler if else ilede yapilabilir
        // if else yerine ternary tercih etme sebebi yapinin basit ve anlasilabilir olmasidir
        // Ternary icerisinde kompleks kodlar olmaz
        // sadece sonuc veya vizi sonuca goturen basit islemler olabilir

        // kullanıcıdan bir tam sayi alip tek mi cift mi yazdiran bir kod yazalim

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("sayi cift");
        }else{
            System.out.println("sayi tek");
        }

        System.out.println(sayi%2==0 ? "sayi cift" : "sayi tek");









    }
}
