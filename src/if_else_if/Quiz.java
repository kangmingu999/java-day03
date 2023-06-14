package if_else_if;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int all; 
		int a;	 
		int b;
		int c;
		System.out.println("사용할 범위의 가격을 입력해 주세요 :");
		all=sc.nextInt();  
		System.out.println("제품의 가격을 하나씩 입력해 주세요 :");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int maa = a+b+c; 
		int num = all-a-b-c; 
		if(all>=a){	
				System.out.println("총합은"+ maa+"원 이며,"+num+"원을 세이브 했습니다.");
			}else { 
				System.out.println("한정되어있는"+all+"원 보다"+(-num)+"만큼 더쓰셨습니다.");
			}
		}			
	}

