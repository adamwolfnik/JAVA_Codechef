import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class hisghScore
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n1=sc.nextInt();
		    int[] n=new int[4];
		    for(int j=0;j<4;j++){
		        n[j]=sc.nextInt();
		    }
		    Arrays.sort(n);
		    System.out.println(n[3]);
		}
        sc.close();
	}
}