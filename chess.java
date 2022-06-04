import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class chess
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int k=(y-x)/8;
		    if(x==y){
		        System.out.println(0);
		    }
		    else if(y>x){
		        if(k<1){
		            System.out.println(1);
		        }
		        else if((y-x)%8!=0){
		            System.out.println(k+1);
		        }
		        else if((y-x)%8==0){
		            System.out.println(k);
		        }
		    }
		}
        sc.close();
	}
}