import java.util.Scanner;
public class Ishu
{
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	int n,i,temp;
	int[] p=new int[100];
	n=scan.nextInt();
	for(i=0;i<n;++i)
		{
		temp=scan.nextInt();
		p[temp-1]=i+1;
		}
	for(i=0;i<n;++i)
		System.out.print(p[i]+" ");
	}
}