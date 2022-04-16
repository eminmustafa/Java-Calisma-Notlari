package day15_mehtodCreation;

public class F08_methodCreation {
    public static void main(String[] args) {

        String isim = "yasemin yalcin ";
        String soyisim="sari";
        String kKNo="1234567890123456";


        //eger bir method dan bir islem yapmasını
        //ve yaptıgı islemi bize getirmesini isterseniz
        //return tpe void degil, bize getirecegi sonucu data turunde olmalıdır
        String gizlenmisIsimSoyisim= isimSoyisimGizle(isim,soyisim);
        // bana isim ve soyisim gizlenmis halini getirmesini istiyorum
        // bekledigim donus String olur

        System.out.println(gizlenmisIsimSoyisim);

         String gizlenmisKKNo= krediKartiGizle(kKNo);
        System.out.println(gizlenmisKKNo);




    }

    private static String krediKartiGizle(String kKNo) {
        String yeniKKNo= "**** **** **** " + kKNo.substring(12);
        return yeniKKNo;

    }

    public static String isimSoyisimGizle(String isim, String soyisim) {
        String yeniIsim = isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S", "*");

        String yeniSoyisim= soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");
        // method olusturmada 3. adım
        // method calısınca sadece birsey mi yazdiracak
        // yoksa bize bir data mi dondurecek buna karar vermektir
        //bu soruda gizlenmis isim soyisim dondurmesi istenmekteden
        // return type'i void degil String sectik
        // ve methodun sonuna return edilecek datayi yazdik
        return  yeniIsim+" "+yeniSoyisim;

    }
}
