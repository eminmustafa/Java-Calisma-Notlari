package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.concurrent.LinkedTransferQueue;

public class F05_Arrays {
    public static void main(String[] args) {

        // verilen bir array'e yeni bir element ekleyen bir method olusturun

        int arr[]={3,5,7};

        // arr[3]=8; array'de olmayan bir indexe atama yapamayiz

        // arr={1,3,5,6}; // var olan bir array'e icinde  ayni boyutta bile olsa direkt yeni degeler iceren array atayamayiz

        arr=new int[4]; // [0, 0, 0, 0]
        System.out.println(Arrays.toString(arr));


        int arrYEni[]=new int[5];

        arr=arrYEni;
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0]

        arrYEni[0]=2;
        arrYEni[3]=5;

        arr=arrYEni;
        System.out.println(Arrays.toString(arr));

        // bir array'e icinde hazir elementlerin oldugu yeni bir array atamak istersen
        // bunu {1,2,3} seklinde yazarak degil
        // new int[3] diyerek olusturup sonra deger atayarak tamamladigimiz bir array'i
        // assing ederek yapabiliriz

        int arrEnyeni[]={1,2,3,4,5};
        arr=arrEnyeni;
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]



    }
}
