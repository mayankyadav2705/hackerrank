package c1;

import java.util.Scanner;

public class bubble_r {
	
	public static int[] sort(int a[],int i,int j)
	{
		if(i<a.length-1)
		{
			if(j==a.length)
			{
				return a;
			}
			sort(a,0,j++);
		}
		else
		{
			if(a[i]>a[i+1]) {
				int tem=a[i];
				a[i]=a[i+1];
				a[i+1]=tem;
			}
			sort(a,i+1,j);
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		a=sort(a,0,0);
	}

}
