package day11_stringManipulation;

import java.util.Scanner;

public class F03_equalsIgnoreCase {
    public static void main(String[] args) {

        // kullanıciya derse katilip katilmak istemedigini sorun
        // evet derse, cevabini ve" derse katilimiz alinmistir" yazdirin
        // hayir derse, cevabini ve " sonraki derslerimize bbekleriz" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Derse katilmak ister misiniz?  Evet veya Hayir yaziniz");
        String  cevap= scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz : " + cevap + " derse katiliminiz onaylanmistir");

        }else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz : " + cevap + " sonraki derslerimize bekleriz");

        }else{
            System.out.println("lutfen evet veya hayir yaziniz");
        }


    }
}
