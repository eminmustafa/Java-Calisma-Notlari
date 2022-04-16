package day39_overriding;

public class OverridingChild extends OverridingParent {

    public   void  method1(){
        System.out.println("Child class method1");
    }

    public static void main(String[] args) {

        /*
            bir obje olusturulurken data turu ve constructor ayni class'dan secilmisse
            java direkt o class'a gider
            hem variable hemde method icin
            o class'dan kullanir, yoksa o class'in
            parant'larina bakar
         */

        OverridingChild obj1=new OverridingChild();
        obj1.method1(); // Child class method1
        obj1.method2(); // Parent class method1



        OverridingParent obj3=new OverridingParent();
        obj3.method2(); // Parent class method2
        obj3.method1(); // Patent class method1

        /*
           eger data turu parant, constructor child class'dan secildiyse
           variable'larda yuakridaki sekilde calsima devam eder
           ancak methodlar icin data turunun oldugu class'daki method
           child class tarafindan OVERRIDE edilmis mi diye kontrol etmemiz gerekir
           eger child class'larda bu method overriding edilmisse
           override eden method calisir
         */

        OverridingParent obj2=new OverridingChild();
        obj2.method2(); // Parent class method2
        obj2.method1(); // Child class method1



    }
}
