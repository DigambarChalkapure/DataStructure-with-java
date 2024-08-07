public class Variableassigningarray {
    public static void main(String[] args) {
        int [] x= {1,2,3,4,10,5,6,7,7,8,8};
        int[] b = x;

        for(int i = 0; i< b.length; i++){
            System.out.println(b[i]+"\n");
        }
        for(int i = 0; i< x.length; i++){
            System.out.println("\t"+x[i]);
        }
    }
}
