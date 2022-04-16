package day12__StringManipulation;

public class F04_endWiith {
    public static void main(String[] args) {
        // Kullanıcıdan wmail adresini girmeyi isteyiniz
        // mail @gmail.com icermiyorsa "lutfen gmail adresi giriniz"
        //@gmail.com ile bitiyorsa "Email adresiniz kaydedildi"
        //@gmail.com ile bitmiyorsa "Lutfen yazimi kontrol edin" yazdirin
        //mehmet@gmail.com.tr

        String email = "mulkiyeayboy@gmail.com";
        String arananMetin = "@gmail.com";

        if (!email.contains(arananMetin)){
            System.out.println("lutfen gmail adresi giriniz");
        }else if (email.endsWith(arananMetin)){
            System.out.println("Email adresiniz kaydedildi");

        }else{
            System.out.println("Lutfen yazimi kontrol edin");
        }
    }
}
