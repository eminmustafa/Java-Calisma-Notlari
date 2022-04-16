package day29_StaticKeyword;

public class F02_staticKeyword {

    public static void main(String[] args) {

        // baska class'daki static class uyelerine
        // ulasabilmek icin sadece classIsmi.staticUyeIsmi
        //yazmamız yeterlidir

        System.out.println(F01_Static.okulTelefonu); // 3122563635

        F01_Static.okulTelefonu="3125474747";

        System.out.println(F01_Static.okulTelefonu); // 3122563635

        // Baska class'daki static olmayan class uyerine
        // ancak o classdan obje olusturarak ulasabililriz
        // ve obje ile yapılan atamalar sadece o obje icin gecerli olur

        F01_Static obj1=new F01_Static();
        F01_Static obj2=new F01_Static();

        System.out.println(obj1.okulIsmi); // Yildiz koleji
        obj2.okulIsmi="Sabir koleji";
        System.out.println(obj1.okulIsmi); // Yildiz koleji






    }
}
