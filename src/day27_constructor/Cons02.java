package day27_constructor;

public class Cons02 {
    public static  void main(String[] args) {

        Cons01 obj1 = new Cons01 (); // default contructor devrede
        /* Cons01 class'inda hic constructor olusturmazsak
         java default constructor'i kullanmadigindan
         obj1'i uretebiliriz


         Anacak biz parametreli ve parametresiz bir constructor yazdigimizda
         Java default constructor'i siler.

         Dolayisiyla biz herhangi bir constructor oluşturdugumuzda
         daha once baska classlar veya kullanicilarin
         olusturmus olabilecegi objeleri kullanabilmeleri icin
         default constructor'in islemini geceklestirecek
         paramatresiz bir constructor olusturmakta fayda var


         */

        Cons01 obj2=new Cons01("Java");

    }
}
