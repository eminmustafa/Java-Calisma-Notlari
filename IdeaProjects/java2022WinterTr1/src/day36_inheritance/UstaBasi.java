package day36_inheritance;

public class UstaBasi extends Isci {


    public static void main(String[] args) {
        UstaBasi ustaBasi1=new UstaBasi();
        ustaBasi1.saatUcreti=15;
        ustaBasi1.isim="Murat";
        ustaBasi1.soyisim="Gokcek";
        ustaBasi1.maas= ustaBasi1.massHesapla();
        System.out.println(ustaBasi1);

    }
    @Override
    public String toString() {
        return "UstaBasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
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
