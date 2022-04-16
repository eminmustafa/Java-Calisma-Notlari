package day17_ForLoop;

public class F07_ForLoop {
    public static void main(String[] args) {
        // Interview Question kullanidan 100'den kucuk bir tamsayı isteyin
        // 1'den baslayarak girilen sayiya kadar tum satilari yazdirin.Ancak;
        //sayi 3'un kati ise sayi yerine "Java" yazdirin
        // sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin
        // sayi hem 3'un hem 5'in kati ise sayi yerine "Java Guzeldir" yazdirin


        int sayi=60;

        for (int i = 1; i <=sayi; i++) {

            if (i%3==0 && i%5==0){
                System.out.print(i + "Java Guzeldir");
            } else if(i%3==0){
                System.out.print("Java ");
            }else if (i%5==0 ){
                System.out.print("Guzeldir ");
            }else{
                System.out.print(i + " ");
            }

        }



    }
}
