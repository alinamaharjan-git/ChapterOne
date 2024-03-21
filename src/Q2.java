import java.util.Scanner;
public class Q2 {
    public static void main(String[] sarg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal:");
        int p=sc.nextInt();

        System.out.println("Enter the time:");
        int t=sc.nextInt();

        System.out.println("Enter the rate:");
        int r=sc.nextInt();

        int simpleInterest=(p*t*r)/100;

        System.out.println("The simple interest is  :"+simpleInterest);



    }
}
