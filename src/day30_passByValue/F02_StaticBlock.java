package day30_passByValue;

public class F02_StaticBlock {

    {
        /*
        static olmayan blocklar ise obje olusturulurken calisir


        static blocklar sadece 1 kere claisir ama
        static olmayan blocklar her obje olusturulurken yeniden calisir
         */
        System.out.println("static olmayan block calisti");
    }
    static{
        System.out.println("static block calisti");
    }


    public static void main(String[] args) {
        System.out.println("main merhod basi");

        F02_StaticBlock obj1=new F02_StaticBlock();
        F02_StaticBlock obj2=new F02_StaticBlock();

    }
}
