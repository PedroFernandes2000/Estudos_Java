
package fiboncci;

/**
 *
 * @author 17824810607
 */
import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int  num = sc.nextInt();
            int n1=0,n2=1;
            for(int i = num; i >= 0 ; i--){
                System.out.println(n1);
                n1 = n1+n2;
                n2 = n1;
            }
        }
}
