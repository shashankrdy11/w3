public class Prime{
    public static void main(String args[]){
        int n = 6;
       int count=0;
        for(int i=2;i<=n;i++){
           if(i%n==0){
             count++;
           } 
           }
         if(count==1){
            System.out.println("prime");
            
        }
        else{
             System.out.println(" not prime");
            
        }

}
}
