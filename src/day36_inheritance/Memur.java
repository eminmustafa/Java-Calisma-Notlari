package day36_inheritance;

public class Memur extends Muhasebe{

    public static void main(String[] args) {


        Memur memur1= new Memur();
        // memur1 objesi memur classinin objesi olmasia ragmet
        // inherit ettigi muhasebe ve onunda Parent'i olan Personel
        // class'larindaki tum datalari alabilir

        // Personel class'indan
        memur1.personelNo=1001;
        memur1.isim="Ahmet";
        memur1.soyisim="Tepecik";
        memur1.adres="Ankara";
        memur1.tel="3125756595";

        // Muhasebe class'indan
        memur1.saatUcreti=10;
        memur1.maas=memur1.massHesapla();
        memur1.statu="Memur";
        System.out.println(memur1);




        Memur memur2=new Memur();
        memur2.personelNo=1002;
        memur2.saatUcreti=10;
        memur2.maas= memur2.massHesapla();

        System.out.println(memur2);
    }

    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", personelNo=" + personelNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
