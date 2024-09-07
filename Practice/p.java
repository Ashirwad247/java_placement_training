import java.io.*;
import java.util.*;
//user defined exceptiption


class P extends Exception{

     private static int bal[] = {1001, 1002, 1300, 999, 1500};//will not print 999 and 1500
   P(){

   }
    P(String str){
      super(str);
    }
    

  
      //line 431
   
    public static void main(String []args) {
      
      for(int i =0;i<5;i++){
        try{
        P pp = new P("Amoutn balance is less");
        if(bal[i]<1000) throw pp;

        System.out.println(bal[i]);

        }catch(P pp){
          pp.printStackTrace();
        }
      }
     }
    
}