package day20_scope_Arrays;

public class F01_Instance_Veriable {

    int sayi;
    String bransİsmi="Java";
    boolean okuldaMi;


    public static void main(String[] args) {

        // sayi=10; sayi variblesi static olmadigi icin main method'dan direk kullanilmaz
        // instace variable'lara static method'lardan ulasabilmek icin obje olusturmamiz geek

        F01_Instance_Veriable obj1=new F01_Instance_Veriable();
        System.out.println(obj1.sayi); // 0
        obj1.sayi=10;
        System.out.println(obj1.sayi); // 10
        obj1.bransİsmi="SQl";
        System.out.println(obj1.okuldaMi);// false



        F01_Instance_Veriable obj2=new F01_Instance_Veriable();
        System.out.println(obj2.sayi); // 0
        System.out.println(obj2.bransİsmi);// Java


        obj1.okuldaMi=true;
        System.out.println(obj2.okuldaMi);// false




    }
}
