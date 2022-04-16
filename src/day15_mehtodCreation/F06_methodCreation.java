package day15_mehtodCreation;

public class F06_methodCreation {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        // miki variablenin degerlerini toplayan bir method olusturalim
        //1.adım : method adını yazalım
        //2.adın : method a gondrmem gereken arhument var mı


        ikiSayiTopla(25,50);

        F04.dortHarfiTersineCevir("sema");

    }
    // bir method'u olusturmak calismasi icin yeterli degildir
    // method ancak cagrılırsa calısır
    // aynı class veya farkli class!da olmasının hicbir onemi yoktur
    // Java main meyhod'da yukaridan asagiya dogru calisir
    // ve geldigi satiri calistirir

    public static void ikiSayiTopla(int a, int b) {
        System.out.println("verilen iki sayinin toplami : "+ (a+b));
    }
}
