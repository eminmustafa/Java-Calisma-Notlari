package day45_interfaces;

public interface I01_Default_Static {
    /*
         Inferface'lerde sadece abstrac method'lar bulunur
         body'si olan concrete bir method olusturmak istedeigimizde
         Java CTE verir


         Ancal Java8 ve uzeri versiyonlarda, istisnai olarak
         static veya default olarak tanimlanan method'larin boyd'si olabilir
         ancak burada kullanilan default keyword'u access modifier degildir
         cunku Interface'lerde tum method'lar public ve abstract'ti


         asagidaki ornekte gorulecegi gibi default oalrak tanimlanmis
         bir method'a access modifier olarak public yazabilirsiniz
         (access modifier yazmasak da Java method'u public olarak kabuledecektir)
     */

    void  method1();


   public default void  method2(){
       System.out.println("INTERFACE'DEKI DEFAULT METHOD");
    }

   static void  method3(){
       System.out.println("INTERFACE'DEKI STATIC METHOD");
    }

}
