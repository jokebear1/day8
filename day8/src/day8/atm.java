package day8;

import java.util.Scanner;

public class atm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int max=5;
		
		int[] adId=new int[max];
		int[] arPw=new int[max];
		int[] arMoney=new int[max];
		
		int count=0;
		int log=-1;
		
		String menu="=== �ް� IT ATM ===\n";
		menu+= "1. ȸ������ \n2. ȸ��Ż�� \n3. �α��� \n4. �α׾ƿ� \n";
		menu+= "5. �Ա� \n6. ��ü \n7. �ܾ���ȸ \n8. �������� \n0. ����";
		
		while(true)
		{
		  System.out.println(menu);
		  int s=sc.nextInt();
		  
		  if(s==1)
		  {
			  System.out.println("ID�Է�: ");
			  int id=sc.nextInt();
			  
			  for(int i=0; i<5; i++)
			  {
				  if(adId[i]==id)
				  {
					  System.out.println("�ߺ��� ����");
					  break;		  
				  }
				  else if(adId[i]==0)
				  {
					  adId[i] = id;
					  System.out.println("PW�Է�: ");
					  int pw = sc.nextInt();
					  arMoney[i]+=1000;
					  log=0;
					  
					  break;
					
					 
				  }
			  }
			 }
		  if(s==2)
		  {
			  if(log==-1)
			  {
				  System.out.println("�α����ϼ���~~");
				  continue;
			  }
			  else if(log==0)
			  {
				  System.out.println("Ż��");
				 log=-1;
			  }
			  
		  }
		 if(s==3)
		 {
			 if(log==0)
			 {
				 System.out.println("�α׾ƿ��ϼ���");
				 continue;
			 }
			 else if(log==-1)
			 {
				 System.out.println("Id�Է�: ");
				 int id=sc.nextInt();
				 System.out.println("Pw�Է�: ");
				int pw=sc.nextInt();
				
				for(int i=0; i<5; i++)
				{
					if(adId[i]==id && arPw[i]==pw)
					{
						System.out.println("�α��ε�");
					}
					else
					{
						System.out.println("�ٽ��Է�");
						break;
						
					}
				}
				
				
			 }
		 }
		  
		}
	} 
}

		
		
	
	


