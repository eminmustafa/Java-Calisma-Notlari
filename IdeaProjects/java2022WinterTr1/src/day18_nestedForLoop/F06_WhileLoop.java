package day18_nestedForLoop;

public class F06_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan iki tamsayi alip
        // bu sayilari ve aralarindaki tum tamsayilari yazdiran bir kod olusturunuz


        int  baslangic=40;
        int bitis=60;


        for (int i = baslangic; i <=bitis; i++) {
            System.out.print(i + " ");

        }
        System.out.print("");

        // ayni sauyu while loop ,le yapalim
        int i=baslangic;
        while (baslangic <=bitis){

            System.out.print(i+ " ");
            i++;

        }
        System.out.println("");
        System.out.println(baslangic); // 61
    }
}
