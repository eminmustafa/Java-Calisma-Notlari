package day18_nestedForLoop;

public class F04_nestedForLoop {
    public static void main(String[] args) {
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */
        int input=5;



        for (int i = 1; i <=input; i++) {

            for (int j = 1; j <=i; j++) {

                System.out.print("* ");

            }
            System.out.println(" ");
        }
        for (int i = 1; i <=input-1 ; i++) {

            for (int j = 1; j <=input-i; j++) {

                System.out.print("* ");

            }
            System.out.println(" ");
        }





    }
}



