package day12__StringManipulation;

import java.util.Scanner;

public class F06_replaceAll {
    public static void main(String[] args) {

        // kullanicidan isin-soyisim bilgisinialip
        //butun harfleri * yapalim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminiiz ve soyisminiz yaziniz");
        String isimSoyisim=scan.nextLine();

        System.out.println(isimSoyisim.replaceAll( "\\S","*"));

    }
}
