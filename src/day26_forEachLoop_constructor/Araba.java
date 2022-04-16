package day26_forEachLoop_constructor;

public class Araba {
   /* Javada her class olusturdugumuzda
     java o class dan ileride objeler uretmek gerekecegini bilir
     ve biz ozelliklede belirtmesek de java
     her olusturdugu class'a bir constructor koyar

     Java nın class olustururusken class a koydugu constructor'a
     DEFAULT CONSTRUCTOR denir ve bu constructor gorunmez

     Eger biz gorunur bir constructor imiz olsun istersek
     default constructor ile ayni gorevi yapan bir constructor olusturabiliriz
     veya istersek ayni kaliptan farkli desenlerde objeler olusturmak icin
     farkli ozelliklerde contructorlar da olusturabiliriz

     constructor lari birbirinden farklilastiran tek ayricalik
     kullanilan parametre sayisi ve parametre data turudur.
    */

    public Araba(){
        System.out.println("parametresiz constructor calisti");

    }
     /* bir kod blogunun method veya constructor olasından emin olmak istiyorsaniz
        iki seye dikkat etmelisiniz
        1- constructorlar'in ismi class ismi ile ayni olmak zorundadir yani buyuk harfle baslar
        2- constructor'larin return type'i olmaz

        ozetle : contructor adi class adi ile ayni olmali
                 return type'i olmamali
      */

    public Araba (String renk){
        System.out.println(renk + " renkli bir araba uretildi");
    }
    public Araba (int yil){
        System.out.println(yil + " model bir araba uretildi");
    }
    public Araba(int yil, String renk){
        System.out.println(yil + " model " + renk+ " renginde bir araba uretildi ");
    }



}
