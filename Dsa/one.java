
class one{
  //automorphic nubmer
  //works for up to only two digit numbers n
   public static void main(String []args){
    int n = 36;
    int sq = n*n;
    int accum=0;
    int count =0;
    while(sq!=0){
        if(count==1){
        int rem =sq%10;
        sq/=10; 
        accum=(rem*10)+accum;
        System.out.println(accum);
        if(accum==n) break;
        }else{
        int rem =sq%10;
        sq/=10; 
        accum=rem;
        if(accum==n) break;

        count++;
        }
      
    
    }
    if(accum==n)System.out.println("Automorphic number");
    
   }

}
