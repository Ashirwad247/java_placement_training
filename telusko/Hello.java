// import java.io.*;
import java.lang.String;

class A{

    public A(){
        System.out.println("in A");
    }
      public A(int n){
        System.out.println("in A int");
    }

}class B extends A{
    public B(){
      

        System.out.println("in B");
    }
    public B(int n){
        this();//will constructor of same class
        System.out.println("in B int");
    }
}

public class Hello{
    public static void main(String a[]){
      B b = new B(5);
    }

}
