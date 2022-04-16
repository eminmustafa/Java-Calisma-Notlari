package day45_interfaces;

public class F02_Default_Static_Method implements I01_Default_Static {

   /*
   Bir Interface'de default veya static olarak tanimlanan ve boyd'si olan
   method'larin override edilmesi mecburi DEGILDIR
   eger static olarak tnaimlanmissa zaten override edemeyiz
    */
    @Override
    public void method1() {
        System.out.println("child class method1");
    }
/*
Parent interfa'deki default olarak tanimlanan method'u
istersek override ederiz istersek etmeyiz
ovirride etmezsek method cagrildiginda parent interfa'deki calisir
override edersek child class'daki overiding method calisir
    @Override
    public void method2() {
        System.out.println("child class method2");
    }

 */

    public static void main(String[] args) {

        // Interface'de static oalrak tnaimlnan method'lara
        // static yontemlerle ulasilabilir InterfaceIsmi.methodIsmi
        //
        I01_Default_Static.method3();

        F02_Default_Static_Method obj = new F02_Default_Static_Method();
        obj.method1(); // Child class'dan alir
        obj.method2(); // Parent Infetface'den alir
        // obj.method3(); eski class'larda static bir uyeye
        // static olmayan yollarla da ulabilirdir
        // ancak interface icerinde static olarak tabimlanan method'a
        // static olmayan yontemlerle ulasilamaz


    }
}
