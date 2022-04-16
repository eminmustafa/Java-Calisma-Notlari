package day17_ForLoop;

public class F05_ForLoop {
    public static void main(String[] args) {
        // Kullanicidan 100'den kucuk bir tamsayi isteyin
        // 1'den baslayarak girilen sayiya kadar 3'un kati olan sayilari yazdirin

        int sayi=57;

        for (int i = 1; i <=sayi; i++) {

            if (i%3==0){
                System.out.print(i + " ");
            }

        }


    }
}
