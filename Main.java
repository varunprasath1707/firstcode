package Main;

import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner Scanner =new Scanner(System.in);
		int d[]=new int[10];
		System.out.println("enter the array elements");
		for(int i=0;i<d.length;i++)
		{
			
			d[i]=Scanner.nextInt();
	
		}
		int h=d[0];
		for(int i=1;i<10;i++)
		{    
			if(h<d[i])
			{
				h=d[i];
			}
			
		}
		System.out.println(h);
		
	}
}
