package day20_scope_Arrays;

public class F02_StaticVeriable {

    /* instance variableler objeye baglidirlar ve her obje farkli degerler alabilir
        ogrenci notlari veya ogretmen branslari gibi
        bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate alir

        static variableler ise class variable olarak tanimlanir
        ve tum class uyeri icin aynidir. okul ismi, okul mudurunun adi gibi
        eger static variable'in degeri degistirilirse herkes icin degisir.


     */


    static String okulIsmi ="Yildiz Koleji";
    static int okulNo;
    static boolean okulAcikMi;

    public static void main(String[] args) {

        System.out.println(okulIsmi);// Yildiz Koleji
        System.out.println(okulNo);// 0
        okulNo=102;
        System.out.println(okulNo);// 102
        System.out.println(okulAcikMi);// false

        sataticMethod();

        System.out.println(okulNo);// 200

    }

    public  static  void sataticMethod (){
        okulNo=200;
        System.out.println(okulNo);// 200
    }
}
