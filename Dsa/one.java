import java.io.*;
import java.util.*;
class one{
  //two-sum leetcode
   public static void main(String []args){
    int arr[] = {3,2, 4};//becomes 234
    int[][] a = new int[arr.length][2];
    for(int i=0;i<arr.length;i++){
      a[i][0] = arr[i];
      a[i][1] = i;
    }
    int t = 6;
    Arrays.sort(a, (c, d)->Integer.compare(c[0], d[0]));
    // System.out.println(arr);
    int l = 0, r = arr.length-1;
    // for(int n:arr){
    //   System.out.println(n);
    // }
    while(l<r){
      int sum = a[l][0]+a[r][0];
      if(sum==t){ System.out.println(a[l][1]);
        System.out.println(a[r][1]);
        break;}
      else if(sum<t) l++;
      else r--;

    }
  

    }
   


   

}
