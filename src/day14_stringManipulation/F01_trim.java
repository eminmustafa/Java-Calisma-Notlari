package day14_stringManipulation;

public class F01_trim {
    public static void main(String[] args) {

        String str="  Siz ne derseniz, deyin java bildigini okur.  ";

        str.trim();
        System.out.println(str); //  Siz ne derseniz, deyin java bildigini okur.
        System.out.println(str.length());//47



        str=str.trim();
        System.out.println(str); //Siz ne derseniz, deyin java bildigini okur.
        System.out.println(str.length()); //43


        str="ali okula git \ngit ali git";
        System.out.println(str.trim());


    }
}
