package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class F03_listdenElementleriSilme {
    public static void main(String[] args) {
        // verilen bir array'dan istenen elemneti (kac tane varsa) slip,kalanlari
        // yeni bir array olarak yazdiran bir method olusturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=3;

        istenmeyenElementiSilveYazdir(arr,  istenmeyenEleman);
    }

    public static void istenmeyenElementiSilveYazdir(int[] arr, int istenmeyenEleman) {

        List<Integer> yeniList= new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] != istenmeyenEleman){
                yeniList.add(arr[i]);
            }
        }

        System.out.println(yeniList);
    }
}
