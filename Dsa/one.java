class one{


    public static void main(String args[]){
        //for leap year or not
        int year = 2004;
        if((year%4==0)&& (year%400==0)||(year%100)!=0){
            System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }
    
    }
}