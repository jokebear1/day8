package day8;

import java.util.Random;
import java.util.Scanner;

public class oneto {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		
		final int s=9;
		
		int[] front=new int[s];
		int[] back=new int[s];
		
		for(int i=0; i<s; i++)
		{
			front[i]=(i+i);
			back[i]=s+(i+1);
		}
		for(int i=0; i<s; i++)
		{
			int num=ran.nextInt(s);
			int temp= front[0];
			front[0]=front[num];
			front[num]=temp;
			
			num=ran.nextInt(s);
			temp=back[0];
			back[0]=back[num];
			back[num]=temp;
		}
		
		int data=1;
		while(true)
		{
			int answer=0;
			for(int i=0; i<s; i++)
			{
				if(front[i] == data);
				answer=i;
			}
		
			System.out.println(data+"["+ answer +"]");
	
	for(int i=0; i<s; i++)
	{
		if(front[i] == 0)
		{
			System.out.print(" ");
		}
		else
		{
			System.out.print(front[i]+" ");
		}
	}
	System.out.println();
	
	System.out.print("["+data+"]의 인덱스 입력: ");
	int idx=sc.nextInt();
	
	if(front[idx] == data)
	{
		if(1<=data && data<=s)
		{
			front[idx]=back[idx];
		}
		else
		{
			front[idx] = back[idx];
		}
	}
	data++;
		}
		
		

	}

}
