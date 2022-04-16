package day18_nestedForLoop;

public class F02_nestedForLoop {
    public static void main(String[] args) {

        // Kullanicidan bir arakam alıp carpim tablosu olusturalim
        int input=5;

        //1 2 3         1*1  1*2  1*3
        //2 4 6         2*1  2*2  2*3
        //3 6 9         3*1  3*2  3*3

        for (int i = 1; i <=input; i++) {


            for (int j = 1; j <=input; j++) {

                System.out.print((i*j) + "  ");
            }


            System.out.println(""); // satiri assagiya gecirmek icin yapildi

        }

    }

}

