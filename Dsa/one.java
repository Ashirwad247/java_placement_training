import java.lang.*;
import java.util.Arrays;

class one
{
    public static void main (String[] args) {
        int[] arr = {5, 8, 5, 7, 8, 10};
        int size = arr.length;
        countFrequency(arr, size);
    }

    static void countFrequency(int[] arr, int n)
    {

        Arrays.sort(arr);

        for(int i =0 ;i<n;i++){
          int count = 1;
          while(i<n-1 && arr[i]==arr[i+1]){
            i++;count++;
          }
          // System.out.println(i);
          System.out.println(arr[i]+" "+count);
        }
    }
}