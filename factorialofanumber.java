import java.util.Scanner;
public class factorialofanumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of N");
        int N = sc.nextInt();
        int fact =1;
        int i = 1;
        while(i<=N){
            fact *= i;
            i++;
        }
        System.out.println(fact);
    }
}
