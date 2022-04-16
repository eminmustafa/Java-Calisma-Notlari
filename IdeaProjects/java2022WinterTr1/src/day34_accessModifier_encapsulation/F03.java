package day34_accessModifier_encapsulation;

public class F03 {
    // encapsule edecegimiz 2 variable olsun

    private int sayi;
    private String str;

    public int getSayi() {
        return sayi;
    }


    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return
                "sayi=" + sayi +
                ", str=" + str ;
    }
}
