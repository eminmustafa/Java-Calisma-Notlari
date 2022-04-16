package day21_Arrays;

import java.util.Arrays;

public class F02_Arrays {
    public static void main(String[] args) {

        String arr1[]={"Ali", "Veli", "Ayse"};
        // array icindeki elementlere ulasabilmek icin index kullaniriz

        System.out.println(arr1[0]); // Ali

        arr1[1]="Esila";

        System.out.println(arr1[1]); // Esila

        // array icindeki indexi kullanrak elementlere ulasabilir ve update edebililriz

        int arr2[]= new int[4];

        System.out.println(arr2[1]);// 0
        System.out.println(arr2[3]);// 0
       //  System.out.println(arr2[5]);// ArrayIndexOutOfBoundsException

        // arrayin tamamini yazdirmak istersek

        System.out.println(arr2); // [I@7f63425a
                                  // array'ler non pirimitive olduklarindan direk yazdirmak istersek
                                  // Java referans bilgisini yazdirir

        for (int i = 0; i <4; i++) {
            System.out.print(arr2[i] + " "); // 0 0 0 0
        }
        System.out.println("");
        // arrayi yazdirmak icin Javadaki arrays class'indan toString() kulanilir

        System.out.println(Arrays.toString(arr2));// [0, 0, 0, 0]

        arr2[1]=11;
        arr2[3]=22;
        System.out.println(Arrays.toString(arr2)); // [0, 11, 0, 22]

        System.out.println(Arrays.toString(arr1)); // [Ali, Esila, Ayse]








    }
}
