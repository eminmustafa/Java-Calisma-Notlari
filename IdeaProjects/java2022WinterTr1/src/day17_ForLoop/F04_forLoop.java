package day17_ForLoop;

public class F04_forLoop {
    public static void main(String[] args) {
        // 10 ile 30 arasindaki(10ve 30dahil)
        // sayilari aralarinda virgül olarak ayni satirda yazdirin

        for (int i = 10; i <=29; i++) {
            System.out.print(i+ ", ");

        }
        System.out.println(30);

        int baslangic=15;
        int bitis=20;
        for (int i =baslangic= 0; i <=bitis; i++) {

            if (i<bitis){
            System.out.print(i + ", ");

        } else{
                System.out.println(i);

            }
        }
    }
}