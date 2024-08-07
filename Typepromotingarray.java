public class Typepromotingarray {
    public static void main(String[] args) {
        int[] x = new int[5];
        float[] y = new float[5];
        x[0] = 10;
        x[1] = 'a';
        x[2] = 't';
        y[0] = 10;
        y[1] = 'a';
        y[2] = 'f';
        y[3] =  2;

        System.out.println(x[0]+" "+x[1]+" "+x[2]+" "+x[3]);

        for (int i =0; i < x.length;i++){
            System.out.println(x[i]);
        }
        for (int j =0; j < y.length;j++){
            System.out.println(y[j]);
        }

    }
}
