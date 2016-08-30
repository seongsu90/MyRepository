package ch06.test2;

import java.util.Scanner;

public class BankApplication {
	
		private static Account[] accountArray = new Account[100];
		private static Scanner scanner = new Scanner(System.in);
		
		public static void main(String[] args) {
		boolean run = true;
		while(run)
		{
			System.out.println("---------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = Integer.valueOf(scanner.nextLine());
			
			if(selectNo==1)
			{
				createAccount();
			}else if(selectNo==2)
			{
				accountList();
			}else if(selectNo==3)
			{
				deposit();
			}else if(selectNo==4)
			{
				withdraw();
			}else if(selectNo==5)
			{
				run = false;
			}
			
		}
		System.out.println("프로그램 종료");

	}
		
		//계좌생성하기
		
		private static void createAccount()
		{
			System.out.println("------------------------------");
			System.out.println("계좌생성");
			System.out.println("------------------------------");
			
			System.out.print("계좌번호: ");
			String ano = scanner.nextLine();
			System.out.print("계좌주: ");
			String owner = scanner.nextLine();
			System.out.print("초기입금액: ");
			int balance = Integer.parseInt(scanner.nextLine());
			
			for(int i=0; i<accountArray.length;i++)
			{
				if(accountArray[i]==null)
				{
					Account ac = new Account(ano,owner,balance);
					accountArray[i]=ac;
					break;
				}
			}
			
		}
		
		private static void accountList()
		{
			System.out.println("------------------------------");
			System.out.println("계좌목록");
			System.out.println("------------------------------");
			
			for(Account ac:accountArray)
			{
				if(ac!=null)
				{
					System.out.println(ac.getAno()+"\t\t"+ac.getOwner()+"\t\t"+ac.getBalance());
				}
			}
		}
		
		private static void deposit()
		{
			System.out.println("------------------------------");
			System.out.println("예금");
			System.out.println("------------------------------");
			
			System.out.print("계좌번호: ");
			String ano = scanner.nextLine();
			System.out.print("예금액: ");
			int balance = Integer.parseInt(scanner.nextLine());
			
			
			if(findAccount(ano)==null)
			{
				System.out.println("맞는 계좌가 없다.");
			}
			else{
				findAccount(ano).setBalance(findAccount(ano).getBalance()+balance);
				System.out.println("예금이 성공되었습니다.");
			}
			/*for(Account ac:accountArray)
			{
				if(ac!=null)
				{
					if(ac.getAno().equals(ano))
					{
					ac.setBalance(ac.getBalance()+balance);
					System.out.println("예금이 성공되었습니다.");
					break;
					}
				}
			}*/
			
			
		}
		
		private static void withdraw()
		{
			System.out.println("------------------------------");
			System.out.println("출금");
			System.out.println("------------------------------");
			
			System.out.print("계좌번호: ");
			String ano = scanner.nextLine();
			System.out.print("예금액: ");
			int balance = Integer.parseInt(scanner.nextLine());
			
			if(findAccount(ano)==null)
			{
				System.out.println("맞는 계좌가 없다.");
			}
			else{
				findAccount(ano).setBalance(findAccount(ano).getBalance()-balance);
				System.out.println("예금이 성공되었습니다.");
			}
			
			
		}
		
		//Account 배열에서 ano 와 동일한 Account 객체 찾기
		private static Account findAccount(String ano)
		{
			for(Account ac:accountArray)
			{
				if(ac!=null)
				{
					if(ac.getAno().equals(ano))
					{
						return ac;
					}
					
				}
			}
			
			return null;
		}
		
		

}
