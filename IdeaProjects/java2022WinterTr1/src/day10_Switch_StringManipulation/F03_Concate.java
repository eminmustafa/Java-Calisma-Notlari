package day10_Switch_StringManipulation;

public class F03_Concate {
    public static void main(String[] args) {
        // Concatenation yapmak icin iki ihrirmalimiz var
        // istersek daha once yaptigimiz gibi + operatorunu kullanabiliriz
        // veya String class'indan gelen concar method'unu kullanabilirliz



        String str1="Java";
        String str2="candir";

        // Java candir yazdiralim

        System.out.println(str1+" "+ str2);

        String cumle=str1.concat(str2); //JavaCandir

        cumle= str1.concat(" ").concat(str2);
        System.out.println(cumle);

         // concat icine String degilde sayi veya boolean deger yazarsak?
        // concat method!u icine string parametre ister
        //String disinda bir data turu yazdiginizda onu string haline getirmelisiniz

        //cumle=str1.concat(5);

        //cumle=str1.concat(true);



    }
}



