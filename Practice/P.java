import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import java.util.stream.Stream;//is an interface
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.*;
import java.util.Random;
import java.io.*;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

class P{
    public static void main(String []args){
      Random random = new Random();
      List<String> l = Arrays.asList("prime numbers", "leap year","reverse nubmer", "palindrome (num)", 
        "perfect square", "automorphic nubmer", "harshad nubmer", "abundant num", "sum of strings", "reverse a string", "remove brackets from list", "prefix sum","top k freq elements", "reverse signed", "sudoku solver", "largest sum contagious array", "remove space in string", "remove vowels in string", 
        "merge two sorted arrays", "search in sorted 2d array", "group anagrams", "longest subsequent array(kadens)", "frequency of array", "print of all permutations of string(recursions) ","F(N)", "valid anagram", "product of array except self", "two sum", "longest consecutive sequence"
      );
      int inde =random.nextInt(l.size());
      System.out.println(inde);
      System.out.println(l.get(inde));

    }}