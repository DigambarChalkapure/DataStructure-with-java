public class countSteps {
       //List<Integer> arr = new ArrayList<>();
       int[] arr= new int[45];
       int step = 0;
      
       public int climbStairs(int n) {
           System.out.println(arr[n]+" "+ step);
          if(arr[n]!=0){
               return step+=arr[n];
          }
          else{
           if(n==0){
              // arr[step]=step++;
               return ++step;
               
           }
           arr[n]=climbStairs(n-1);
   
           if(n >= 2){
               
               arr[n]=climbStairs(n-2);
           }
            return step;
          } 
       }
      public static void main(String args[]){
        countSteps m = new countSteps();
           
          System.out.println(m.climbStairs(6));
      }
}
