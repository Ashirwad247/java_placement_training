

final class Calc{
    public void show(){
        System.out.println("in Calc show");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}
class AdvCalc extends Calc{
    public void r(){
        System.out.println("bla bla");
    }
}
public class Hello{
    public static void main(String a[]){
       Calc obj = new Calc();
       obj.show();
       obj.add(4, 5);
       
    }

}




