import java.lang.*;
import java.util.Arrays;

class one//using recursion
{
  //F(N)=(1)+(2*3)+(4*5*6)+...N.
//F(4)=5167
   

    public static void main(String []args){
      int n = 3;
      System.out.println(term(1, 1, 3));

    }

    public static int term(int calculated, int current, int N){
      if(current==N+1) return 0;
      int i, cur=1;
      for( i =calculated;i<calculated+current;i++){
        cur*=i;
      }
      return cur+term(i, current+1, N);
    }
     
}