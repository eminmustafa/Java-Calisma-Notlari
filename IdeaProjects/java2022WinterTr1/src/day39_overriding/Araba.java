package day39_overriding;

public class Araba {
    protected String hareket="Arabalar teker ile hareket eder";
    protected String hiz="Arabalar motor gucune gore hiz yaoaprlar";
    protected String yakit="Arabalar farkli yakitlar kullanabilir";
    protected String marka="Her arabalar uretildikleri markaya sahiptirler";


    public void  motor(){
        System.out.println("Arabalar farkli markalarda motor kullanirlar");
    }

    public void  yakitTuketimi(){
        System.out.println("Arabalar motor gucu ve yakit turune gore yakit tuketirler");

    }
}
