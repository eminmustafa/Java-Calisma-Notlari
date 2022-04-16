package day22_arryas;

import javax.sql.rowset.serial.SerialStruct;
import java.util.Arrays;

public class F01_Sort {
    public static void main(String[] args) {

        String arr[]={"S","M","A","T"};

        System.out.println(Arrays.toString(arr)); // [S, M, A, T]


        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr)); // [A, M, S, T]
        // Javada bu siralamaya Natural Order denir
        // sayi olursa kucukten buyuge
        // metin olursa alfabatik siralamaya gore

    }
}
