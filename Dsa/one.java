import java.util.*;

public class one {
    //kadens algo
    

    public static void main(String[] args) {
     int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;
        int max_sum = Integer.MIN_VALUE, curr_sum = 0;

        for (int i = 0; i < n; i++) {
          curr_sum+=arr[i];
          if(max_sum<curr_sum) max_sum=curr_sum;
          if(max_sum<0) curr_sum=0;
        }

        System.out.println(max_sum);

    }
    
    
}
