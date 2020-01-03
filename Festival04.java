import java.util.Scanner;

public class Festival04 {

	public static void main(String[] args) {
		// 거스름돈을 입력 받아 내어줘야 하는 지폐의 개수를 출력하는 프로그램
		// 단, 최대단위는 10000원, 최소단위는 100원
		
		Scanner scan = new Scanner(System.in);
		int[] moneyNames = {10000, 5000, 1000, 500, 100};
		int money = 0;
		int result = 0;
		
		System.out.print("총금액 입력>> ");
		money = scan.nextInt();
		
		System.out.println("잔돈 >> "+money);
		for (int i=0; i<moneyNames.length; i++) {
			
			result = money/moneyNames[i];
			System.out.println(moneyNames[i]+"원 >> "+result+"개");
			money = money- result*moneyNames[i];
		}
		scan.close();
	}

}
