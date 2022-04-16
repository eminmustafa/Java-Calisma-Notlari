package day43_garbage_abstractClass;

public abstract class F04 {
    /*
       bir abstract class'da abstract veya concrete methdo'lar bulunabilir
       Child class'larin abstract method'lari override etmesi MECBURI iken
                         concrete method'larin override edilmesi  OPSIONEL'dir
     */

    public  abstract  void  absMethod();

    public  void  concreteMethod(){
        System.out.println("F04 concrete method");
    }


    public static   void  concreteStaticMethod(){
        System.out.println("F04 concrete static method");
    }

    public static void main(String[] args) {
        /*
        Abstract class'lar constructor'a sahiptir
        ancak Abstract class'lardan OBJ OLUSTURULAMAZ

        Abstract class'lar obje barindirmayan
        sadece child class'lar icin
        UYULMASI SART OLAN veya OPSIYONEL birakilan
        ozellikleri tanimladigimiz bir depo class gibidir

        */
       // F04 obj=new F04();
        System.out.println("Bu class abstract");
        concreteStaticMethod();
    }
}
