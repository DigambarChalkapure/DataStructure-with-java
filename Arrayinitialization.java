class Arrayinitialization{
    public static void main(String[] args) {
        int[] x = new int[4];
        x[0]= 10;
        x[1]= 20;
        x[2]= 30;
        x[3]= 40;
        System.out.println(x);
        for(int i = 0; i<x.length;i++){
        System.out.println(x[i]);
        }
        //Another way of initializing and creation of array in one line
        System.out.println("other way of initializatio and creation of array that is in one line");

        int[] a = {11,22,33,44,55};
        System.out.println(a.length);
        for(int i = 0; i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}