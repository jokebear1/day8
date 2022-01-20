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
		
		String menu="=== 메가 IT ATM ===\n";
		menu+= "1. 회원가입 \n2. 회원탈퇴 \n3. 로그인 \n4. 로그아웃 \n";
		menu+= "5. 입금 \n6. 이체 \n7. 잔액조회 \n8. 개인정보 \n0. 종료";
		
		while(true)
		{
		  System.out.println(menu);
		  int s=sc.nextInt();
		  
		  if(s==1)
		  {
			  System.out.println("ID입력: ");
			  int id=sc.nextInt();
			  
			  for(int i=0; i<5; i++)
			  {
				  if(adId[i]==id)
				  {
					  System.out.println("중복띠 ㅋㅋ");
					  break;		  
				  }
				  else if(adId[i]==0)
				  {
					  adId[i] = id;
					  System.out.println("PW입력: ");
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
				  System.out.println("로그인하세요~~");
				  continue;
			  }
			  else if(log==0)
			  {
				  System.out.println("탈퇴");
				 log=-1;
			  }
			  
		  }
		 if(s==3)
		 {
			 if(log==0)
			 {
				 System.out.println("로그아웃하세요");
				 continue;
			 }
			 else if(log==-1)
			 {
				 System.out.println("Id입력: ");
				 int id=sc.nextInt();
				 System.out.println("Pw입력: ");
				int pw=sc.nextInt();
				
				for(int i=0; i<5; i++)
				{
					if(adId[i]==id && arPw[i]==pw)
					{
						System.out.println("로그인됨");
					}
					else
					{
						System.out.println("다시입력");
						break;
						
					}
				}
				
				
			 }
		 }
		  
		}
	} 
}

		
		
	
	


