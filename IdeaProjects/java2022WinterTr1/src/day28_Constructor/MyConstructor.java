package day28_Constructor;

public class MyConstructor {

    int a = 3;
    int y = 5;

    MyConstructor() {
        a += 1;
        System.out.println("-a" + a);
    }

    MyConstructor(int i) {
        this();
        this.y = i;
        a += y;
        System.out.println("-a" + a);
    }

    MyConstructor(int i, int i2) {
        this(3);

        this.a -= 4;
        System.out.println("-a" + a);
    }

    public static void main(String[] args) {
        MyConstructor mc1 = new MyConstructor(4, 3);


    }

}


