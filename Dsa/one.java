import java.util.*;

public class one {
    //kadens algo
    

    public static void main(String[] args) {
      int x = 1000000045;
     boolean negFlag=false;
        if(x<0) {negFlag=true;x=-x;}
        int num=0;
        int prevNum=0;
        while(x>0){
            int r=x%10;
            num=(num*10)+r;
            if((num-r)/10!=prevNum){
                
                break;
            }
            System.out.println(num);
            prevNum = num;
            x=x/10;
        }
        num=negFlag?-num:num;
        System.out.println(num);
    }
    
    
}
