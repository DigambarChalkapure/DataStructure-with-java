import java.util.Scanner;

public class Shower {

    public void shower(int t, Scanner sc) {
        String res ="NO";
        while (t > 0) {
            int inputs = sc.nextInt();
            int timeShower = sc.nextInt();
            int dayTime = sc.nextInt();
            for (int i = 0; i < inputs; i++) {
                int busyTimeStart = sc.nextInt();
                int busyTimeEnd = sc.nextInt();
                if()
            }

            t--; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Shower sh = new Shower();
        sh.shower(t, sc);
    }
}