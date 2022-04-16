package day38_inheritance_overriding;

public class Isci extends  Personel {

    public  String statu="Isci";
    public  String haklar="Isciler kidem tazminati alirlar";
    public  String ikramiye="Isciler yilda bir ikramiye alir";




    public  void  mesai(){
        System.out.println("Tum isciler hafalik 40 saat calisir");
    }

    public  void  maasHesaplama(){
        System.out.println("Tum personel 30 gun * 8 saat * 11 euro = " + (30*8*11) + "Euro maas alir");
    }
}
