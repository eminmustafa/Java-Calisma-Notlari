package day17_ForLoop;

public class F06_ForLoop {
    public static void main(String[] args) {
        // verilen iki harf ve aralarindaki harfleri yazdiran
        // bir kod yazdirin
        
        char ilkHarf='c';
        char sonHarf='s';

        for (char i = ilkHarf; i <=sonHarf ; i++) {

            System.out.print(i + " ");
            
        }
        
        double baslangic=10;
        double bitis=20;
        double artis=0.2;
        // baslangic ve bitiş sayilari arasinda artis miktari ile olusacak
        // tum sayilari yazdirin

        for (double i = baslangic; i <=bitis; i+=artis) {

            System.out.print(i + " ");

        }

    }
}
