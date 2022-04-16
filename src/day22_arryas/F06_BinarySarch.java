package day22_arryas;

import java.util.Arrays;

public class F06_BinarySarch {
    public static void main(String[] args) {

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int istenenSayi=30;
        // eger javada hazir Binarysearch ile yapmak istersek
        // once sort methodunu kullanip,sonra bınarySearch yapmaliyiz
        // Binarysearch() bize istenen sayinin oldugu indexi verir

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        System.out.println(Arrays.binarySearch(arr,istenenSayi)); //

        // eger olmayan bir elementi aratirsak
        // Java bulamadigini gostermek icin - isareti koyar
        // sonra o sayi olsaydi siralamasi ne olacak ise o sirayi bize verir
    }
}
