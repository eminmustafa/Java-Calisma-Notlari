package day41_exceptions;

public class F01_Exceptions {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c=0;

        try {
             c=a/b;
        } catch (Exception e) {
            // burada yazdigimiz e javanin exception'i atayacagi obje
            // Exception ise olusan exception'nin turu

            //e.printStackTrace();
            System.out.println(e.getLocalizedMessage());

        }
        System.out.println(c);


    }
}
