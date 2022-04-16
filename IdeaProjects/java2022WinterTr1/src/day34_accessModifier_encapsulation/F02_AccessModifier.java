package day34_accessModifier_encapsulation;

public class F02_AccessModifier {

    public static void main(String[] args) {

        F01 obj=new F01();

        obj.acikString="Bye";
        F01.acikSayi=50;

        // F01.sayi=15; privite access modifier'i oldugundan baska class'dan eirsimez

        // obj.method1; privite access modifier'i oldugundan baska class'dan eirsimez

        // F01 objParaetreli=new F01(5); privite access modifier'i oldugundan baska class'dan eirsimez




    }
}
