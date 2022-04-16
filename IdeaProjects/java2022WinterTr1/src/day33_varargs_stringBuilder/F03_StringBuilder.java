package day33_varargs_stringBuilder;

public class F03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder("Java cok guzel");
        StringBuilder sb3= new StringBuilder(10);

        System.out.println("sb1 lengt : " + sb1.length()); // sb1 lengt : 0
        System.out.println("sb1 capacity : " + sb1.capacity()); // sb1 capacity : 16

        System.out.println("sb2 lengt : " + sb2.length()); // sb2 lengt : 14
        System.out.println("sb2 capacity : " + sb2.capacity()); // sb2 capacity : 30

        System.out.println("sb3 lengt : " + sb3.length()); // sb3 lengt : 0
        System.out.println("sb3 capacity : " + sb3.capacity()); // sb3 capacity : 10


        // appent methodu ile String builder'e ekleme yapabiliriz

        sb1.append("Java").append(" ").append("cok").append(" ").append("guzel");
        System.out.println("sb1 lengt : " + sb1.length()); // sb1 lengt : 14
        System.out.println("sb1 capacity : " + sb1.capacity()); // sb1 capacity : 16

        sb1.append(3);
        System.out.println(sb1); // Java cok guzel3
        sb1.append(true);
        System.out.println(sb1); // Java cok guzel3true

        System.out.println("sb1 lengt : " + sb1.length()); // sb1 lengt : 19
        System.out.println("sb1 capacity : " + sb1.capacity()); // sb1 capacity : 34

        sb1.append("tum dersler hava olsa");
        System.out.println("sb1 lengt : " + sb1.length()); // sb1 lengt : 40
        System.out.println("sb1 capacity : " + sb1.capacity()); // sb1 capacity : 70

        sb1.trimToSize();
        System.out.println("sb1 lengt : " + sb1.length()); // sb1 lengt : 40
        System.out.println("sb1 capacity : " + sb1.capacity()); // sb1 capacity : 40










    }
}
