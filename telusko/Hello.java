// import java.io.*;
import java.lang.String;
class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A{
     public void show(){//override this method of class
        System.out.println("in B show");
    }
}
public class Hello{
    public static void main(String a[]){
        B ob = new B();
        ob.show();
    }

}
