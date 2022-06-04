import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Contest
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc =new Scanner(System.in);
	    int n=sc.nextInt();
	    int a=sc.nextInt();
	    int b=sc.nextInt();
        sc.close();
	    int r=n-a;
	    int r100=n-a-b;
	    System.out.print(r+" "+r100);
	}
}