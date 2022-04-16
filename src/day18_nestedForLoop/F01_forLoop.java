package day18_nestedForLoop;

public class F01_forLoop {
    public static void main(String[] args) {
        // Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir  tamsayi isteyin
        // ve girilen sayinin faktoryel'ini bulun. (5!=5*4*3*2*1)

        int input=9;
        int faktoriyel=1;
        String faktoriyelAcıkYazim="";
        for (int i = input; i >=1; i--) {

            faktoriyel *=i;
            if (i==input){
                faktoriyelAcıkYazim=faktoriyelAcıkYazim + i ;
            } else
            faktoriyelAcıkYazim =faktoriyelAcıkYazim + "*" + i;
        }
        System.out.println(input+"! = "+ faktoriyelAcıkYazim +" =" + faktoriyel);
    }
}
