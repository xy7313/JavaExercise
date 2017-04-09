package P04factorial;
import  java.util.*;

/**
 * Created by xy on 4/9/17.
 */
public class fac {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a number：");
        int num= Integer.parseInt(sc.nextLine());
        int fac = 1;

        for(int i = 1; i<=num; i++){
            fac*=i;
        }
        System.out.println("a factorial of a number: " + fac);
    }
}
