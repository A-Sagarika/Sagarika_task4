package ah1;

import java.util.Scanner;

public class Area {
	public static void main(String...stringsa)
	{
	
		Scanner s=new Scanner(System.in);
		int p=s.nextInt();
		int t=s.nextInt();
		int r=s.nextInt();
		int n=s.nextInt();
		double sa=(p*t*r)/100;
		int m=r/n;
		double c=p*Math.pow(1+m,n*t);
	}
}
