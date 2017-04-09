package P03multiplication;
import  java.util.*;

/**
 * Created by xy on 4/9/17.
 */
public class multip {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a number：");
        int num= Integer.parseInt(sc.nextLine());
        int fac = 1;

        for(int i = 1; i<=10; i++){
            fac*=i;
            System.out.println(num + " * " + i + " = "+i*num);
        }

    }
}
