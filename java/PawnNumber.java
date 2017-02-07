public class PawnNumber {
    public static void main(String[] args) {
        int [] o={2,-1,3,6};
        int i= 0,s=0;
    
        for (;i<o.length;){
        
            s= o[i]+i;
            i=s;
             
         System.out.println("value of i "+i);
        }
             if (s<o.length){
                 s=o[i]+i;
                 
             } else{
             System.out.println("bumm!out of space");
             }
    }
}
