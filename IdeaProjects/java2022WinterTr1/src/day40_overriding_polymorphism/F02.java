package day40_overriding_polymorphism;

public class F02 extends F01 {

    private  void method4(){
        System.out.println("Parent method4");
        // Parent class'daki private method4'e
        // Child class'dan ulasmamaiz mumkun olmadigindan
        // java bu iki method'u
        // TAMAMEN FARKLI IKI METHOD olarak kabul eder
        // @Override kullnmak istersek java kabul etmez CTE verir
    }
    @Override
    protected  String  method3 (){

        // Covariant icin yazildi

        return "Java";

    }
    @Override
    public void method2() {
        /*
         @Override notasyonu overridden method ile overriding method'u
         biribirine baglar
         Farkinda olunmadan oveririden method silinirse veya signature degistirilirse
         bu iliski bozulacagi icin java CTE veriri

         Notasyon kullanilmazsa java bunlarin iliskisini bilir ama
         overridden method silinirse sesini cikarmaz
          */
        System.out.println("Child method2");
    }

    public static void main(String[] args) {

        F02 obj= new F02();
        obj.method1(); // parent method1 den alip calistirir
        obj.method2(); // Child method2



        F01 obj2 = new F02();
        obj2.method1(); // parent method1
        obj2.method2(); // Child method2

        F01 obj3 = new F01();
        obj3.method1(); // parent method1
        obj3.method2(); // parent method2

    }
}
