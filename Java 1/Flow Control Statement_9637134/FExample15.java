import java.util.Scanner;
class FExample151
{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
	    for(int i = 1;i<=n;++i)
	    {
             for(int j=1;j<=i;++j)
             {
               System.out.print("*");
             }
             System.out.println();
	    }
	    }
	}
