import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;


class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return "Student age="+age+", name= "+name;
    }

    public int compareTo(Student that){
        return this.age>that.age?1:-1;
    }
}

public class Hello{
    public static void main(String a[]){
        // Comparator<Student> com  = new Comparator<Student>(){
        //     public int compare(Student i, Student j){
        //         if(i.age>j.age) return 1;
        //         return -1;
        //     }
        // };//it is compulsory to mention type in right side also for anonymous class
        List<Student> nums = new ArrayList<>();
        nums.add(new Student(21, "Navin"));
        nums.add(new Student(12, "John"));
        nums.add(new Student(18, "Parul"));
        nums.add(new Student(20, "Kiran"));
        Collections.sort(nums);//it is a class
        for (Student s: nums){
            System.out.println(s);
        }
        // System.out.println(nums);
    };
       
}





