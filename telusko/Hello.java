import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import java.util.stream.Stream;//is an interface
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Hello{
    public static void main(String a[]){
            List<Integer> nums = Arrays.asList(4, 5, 7, 2);
        //    Stream<Integer> s1 =  nums.stream();//returns stream object
        // Stream<Integer> s2=s1.filter(n->n%2==0);
        // Stream<Integer> s3=s2.map(n->n*2);
        // int result =s3.reduce(0,(c,e)->c+e);

       int result= nums.stream()
        .filter(n->n%2==0)
        .map(n->n*2)
        .sorted()
        .reduce(0, (c,e)->c+e);

           //you can only use stream one time
        //    s3.forEach(n->System.out.println(n));
        System.out.println(result);
        //    s1.forEach(n->System.out.println(n));//gives error

        Predicate<Integer> p = new Predicate<Integer>(){
            if(n%2==0) return true;
            return false;//or return n%2==0
        }//filter needs object of predicate like filter(p)
        Function<Integer, Integer> f = new Function<Integer,Integer>(){
            public Integer apply(Integer n) {
                return n+2;
            }//or f=n->n*2;

        };//map(f);
        }
     
    }
       






