package day12__StringManipulation;

public class F01_indexOf {
    public static void main(String[] args) {
        // Kullancıdan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanımına bakarak
        // -girilen kelime cumlede kullanilmamis
        // -girilen kelime cumlede 1 kere kullanilmis
        // -girilen kelime cumlede 1'den fazla kullanilmis


        String cumle= "Java ogren yeni  program ile yeni bir sayfa ac";
        String  kelime= "Java";

        int ilkKullanim=cumle.indexOf(kelime); // -1 veya index
        int ikinciKullanim=cumle.indexOf(kelime, ilkKullanim+1);

        if (ilkKullanim==(-1)){
            System.out.println("girilen kelime cumlede kullanilmamis");

        }else if(ikinciKullanim==(-1)){
            System.out.println("girilen kelime cumlede 1 kere kullanilmis");
        }else{
            System.out.println("girilen kelime cumlede 1'den fazla kullanilmis");
        }
    }
}
