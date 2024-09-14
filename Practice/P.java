import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import java.util.stream.Stream;//is an interface
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.*;
import java.io.*;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

class P{
    public static void main(String []args){
      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
      List<Integer> en = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
      System.out.println(en);
       Optional<Integer> sum = numbers.stream()
                                       .reduce(Integer::sum);
        sum.ifPresent(s -> System.out.println("Sum: " + s));

    }}