package day28_Constructor;

public class MyConstructor1 {


    int x =5;
    MyConstructor1(){
        System.out.println("-x" + x );
    }

    MyConstructor1(int x){
        this();
        System.out.println("-x" + x );
    }

    public static  void main(String[] args) {
        MyConstructor mc1 = new MyConstructor(4);

        MyConstructor mc2 = new MyConstructor();

    }
}
