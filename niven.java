
import java.util.Scanner;

public class niven
{
    void checkniven(double n)
    {
        double sum=0;
        double temp=Math.pow(n,2);
        while(temp>0)
        {
            sum +=temp %10;
            temp/=10;
        }
        if(sum == n)
        System.out.println("it is a niven number");
        else
        System.out.println("it is not a niven number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a Niven number:");
        double n1 = sc.nextInt();
        niven obj = new niven();
        obj.checkniven(n1);
    }
}