package if_else_if;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int all=0;
		int a=0;
		int b=0;
		int c=0;
		if(all==150000){
			System.out.println("제품의 가격을 하나씩 입력해 주세요 :"+a+b+c);
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			int num = all-a-b-c;
			int maa = a+b+c;
			if(a+b+c<=all) {
				System.out.println("총합은"+ maa+"원 이며,"+num+"원을 세이브 했습니다.");
			}else {
				System.out.println("한정되어있는"+all+"원 보다"+num+"만큼 더쓰셨습니다.");
			}
		}			
	}
}

