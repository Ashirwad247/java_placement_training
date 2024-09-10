import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import java.util.stream.Stream;//is an interface
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;

class P{
    public static void main(String []args){
        List<Integer> nums = Arrays.asList(4, 5, 7, 2);
        
       Predicate<Integer> p = new Predicate<Integer>(){
         public boolean test(Integer n){
            return n%2==0;
         }
       };
       Function<Integer, Integer> f = new Function<Integer, Integer>(){
        public Integer apply(Integer n){
            return n*2;
        }
      
       };
         Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(p);
        Stream<Integer> s3 = s2.map(f);
        int result = s3.reduce(0, (c,e)->c+e);
        System.out.println(result);



    }
}