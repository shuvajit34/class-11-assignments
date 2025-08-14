import java.util.Scanner;
public class checkno {
    void check(int n,int m)
    {
        for(int i=1;i<=n;i++)
        {
            if(i % m == 0)
            {        
              if(i% 2 == 0)
              {
                System.out.println(i + " is divisible by " + m + " and is also even.");
              }
                else
                {
                System.out.println(i + " is also odd.");
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the range (n): ");
        int n = sc1.nextInt();
        System.out.println("Enter the divisor (m): ");
        int m = sc1.nextInt();
        checkno obj = new checkno();
        obj.check(n, m);
    }

}
