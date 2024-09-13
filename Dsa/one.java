import java.util.*;

public class one {
    //merge two sorted arrays
    

    public static void main(String[] args) {
      int a1[] = {1,3,3,2,3};

      int a2[] = {4, 5, 6};
      Arrays.sort(a1);
      Arrays.sort(a2);
      int arr[] = new int[a1.length+a2.length];
      int i =0, j=0,ind=0;
      while(i<a1.length && j<a2.length){
        if(a1[i]<a2[j]){
          arr[ind++]=a1[i++];
       
        }else if(a1[i]>a2[j]){
          arr[ind++]=a2[j++];

        }else{
          arr[ind++]=a1[i++];
          j++;
        }
      }

      while(i<a1.length){
        arr[ind++]=a1[i];
      }
      while(j<a2.length){
        arr[ind++]=a2[j++];
      }
      for(int k:arr){
        System.out.print(k+" ");
      }
    
    }
}
