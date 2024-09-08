import java.io.*;
import java.util.*;
class one{
  static void printOrder(int []a, int n){
    int temp;
    for(int i =0;i<2;i++){
      for(int j =0;j<n/2;j++ ){
        if(a[j]>a[j+1]){
          temp = a[j];
          a[j] = a[j+1];
          a[j+1] = temp;
        }
      }
      for(int j  =n/2;j<n-1;j++){
        if(a[j]<a[j+1]){
          temp = a[j];
          a[j] = a[j+1];
          a[j+1] = temp;
        }
      }

    }

    for(int s:a){
      System.out.println(s);
    }
  }
  
  public static void main(String args[]){
   int arr[] = {3, 2, 4, 1, 5};
   int n = arr.length;
   printOrder(arr, n);
  }


   


   

}
