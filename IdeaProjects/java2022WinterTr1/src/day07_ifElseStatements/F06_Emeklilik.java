package day07_ifElseStatements;

import java.util.Scanner;

public class F06_Emeklilik {
    public static void main(String[] args) {

        // kullanicidan yasini isteyin
        // 65 veya daha buyukse emekli olabilirsin
        // 65'ten kucukse emkli olamazsin yazdir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();


        if (yas>=65){
            System.out.println("emekli olabilirsiniz");
        } else {
            System.out.println("emekli olamazsiniz");
            System.out.println(65-yas + "sene daha calismalisin");
        }

        // if else statement'larda iki durumdan sadece ve sadece biri calisir
        // ikisinin birden calisma ihtimali ====> YOK
        // ikisinin de calismama ihtimali ====> YOk


    }
}
