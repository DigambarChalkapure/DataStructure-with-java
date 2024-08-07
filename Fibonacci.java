public class Fibonacci {

    public int fibonacci(int n){

        if(n<=1){
            return n;
        } ;

        return fibonacci(n-1)+fibonacci(n-2);
        
    }

    public static void main(String[] args) {
        Fibonacci fi = new Fibonacci();
        fi.fibonacci(5);
    }
    
}
