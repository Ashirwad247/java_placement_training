import java.io.*;
class one{

   public static void main(String []args)throws IOException{
    int arr[] = {1,2,3 ,4, 5};
    int i = 0;
    int j = arr.length-1;
    while(i!=j){
      int temp = arr[i];
      arr[i] = arr[j];
     arr[j]=temp;
      i++;
      j--;
    }
    for(int n:arr){
      System.out.print(n+" ");
    }
   }


   

}
