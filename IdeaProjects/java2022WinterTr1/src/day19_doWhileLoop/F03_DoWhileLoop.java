package day19_doWhileLoop;

public class F03_DoWhileLoop {
    public static void main(String[] args) {

        // Kullanicidan poziitif bir tam sayi alip
        // while loop ile sayidan kucuk pozitif tam sayilari yazdiralim
        int input=3;

        int sayi=1;

        while (sayi<input) {
            System.out.println(sayi);
            sayi++;
        }

        // ayni soruyu do-while loop i,le yapalim
        sayi=1;

        do{
            System.out.println(sayi);
            sayi++;

        }while (sayi<input);


    }



}
