import java.util.*;

public class one {
    //search of an element in 2d matrix using dfs on a sorted matrix
    

    public static void main(String[] args) {

         int a[][] =  {{4,5,2,7}, {0,1,12,3},{8,9,10,6}};
        
        int x = 6;
        int flag=0;

        int i=0, j=3;
  
        while(i<3 && j>=0){
          if(a[i][j]==x){
            System.out.println("Element found at ("+i+","+j+")");
            flag =1;
            break;
          }
          else if(a[i][j]>x){
            j--;
          }else{
            i++;
          }
        }
        if(flag==0)
            System.out.println("Not found");
    }
}
