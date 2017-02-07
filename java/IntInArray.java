Class IntInArray{
    public static void main(String[] args) {
        
        //find number and show position
        int [] k={3,5,12,23,10,9};
        int n=12;
        int i;
        boolean f=false;
        for(i=0;i<k.length;i++){
        if(k[i]==n){
         f=true;
         break;//stop when key number is found
       }   
        }//end for 
        
         if (f){
           System.out.println("found in position  "+i+" in array");
        }else {
           System.out.println("no found");
           
        }
    }
}
