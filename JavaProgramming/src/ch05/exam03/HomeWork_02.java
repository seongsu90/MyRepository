package ch05.exam03;

import java.util.Scanner;

public class HomeWork_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] index = new String[100][];
				
		
		while(true)
		{
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("1. 목록 | 2. 글쓰기 | 3. 상세 보기 | 4. 수정 | 5. 삭제 | 6. 종료");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.print("선택 : ");
			
			String chose = scanner.nextLine();
			
			if(chose.equals(1))
			{
				boolean indexIs = false;
				
				for(String[] indexNumber : index)
				{
					if(indexNumber!=null)
					{
						indexIs = true;
					}
				}
				
				if(indexIs==false)
				{
					System.out.println("저장된 목록이 없습니다.");
					continue;
				}
				
				System.out.println("***************************************");				System.out.println("번호\t제목\t글쓴이\t조회수");
				System.out.println("***************************************");
				
				for(String[] indexS :index)
				{
					if(indexS!=null)
					{
						System.out.println(indexS[0]+ "\t"+indexS[1]+"\t"+indexS[2]+"\t"+indexS[3]);
					}
				}
				System.out.println("***************************************");
				System.out.println();
				
			}
			else if(chose.equals(2))
			{
				System.out.println("제목: ");
				String name = scanner.nextLine();
				System.out.println("내용(한줄만 가능;): ");
				String content= scanner.nextLine();
				System.out.println("글쓴이: ");
				String writer = scanner.nextLine();
				
				for(int i=0;i<index.length;i++)
				{
					if(index[i]==null)
					{
						String[] indexS = {String.valueOf(i),name,writer,"0",content};
						index[i] = indexS;
						break;
					}
				}
				
			}
			else if(chose.equals(3))
			{
				boolean indexIs = false;
				
				for(String[] noIndex : index)
				{
					if(noIndex!=null)
					{
						indexIs=true;
					}
				}
				
				if(indexIs ==false)
				{
					System.out.println("저장되어 있는 글이 없습니다.");
					continue; // continue를 통해 while로 돌아간다.
				}
				
				System.out.println("***************************************");
				System.out.println("번호\t제목\t글쓴이\t조회수");
				System.out.println("***************************************");
				
				for(String[] indexS : index)
				{
					if ( indexS != null )
						System.out.println(indexS[0] + "\t" + indexS[1] + "\t" + indexS[2] + "\t   " + indexS[3]);
				}
			}
			
		}

	}

}
