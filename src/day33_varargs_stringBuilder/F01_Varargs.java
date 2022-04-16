package day33_varargs_stringBuilder;

public class F01_Varargs {

    public static void main(String[] args) {
        //veriilen kac tane String verildiyse verilsin
        //icleridnen en uzun yazdiran bir method olsturun
        String str1="Ali";
        String str2="Veli";
        String str3="Oguzhan";
        String str4="Sametli";

        // Yazilan argument sayisi sabitse herzamnki gibi bir method olsturabiliriz
        // ancak argumet sayisinin degisime ihtimali arsa
        //o zaman varargs tercih edilit
        enUzunKelime(str1,str2,str3,str4);
    }

    private static void enUzunKelime(String... str) {

        String enUzunStr="";

        for (String each : str
        ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;

            }

        }
        System.out.println("En uzun kelime : " + enUzunStr);
    }
}
