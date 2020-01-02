import java.util.Scanner;

public class Festival01 {

	public static void main(String[] args) {
		// 현재몸무게와 목표몸무게를 각각 입력 받고 주차별 감량몸무게를 입력 받아 목표 달성시 축하메시지를 띄우는 프로그램
		
		Scanner scan = new Scanner(System.in);
		int weight = 0;
		int newWeight = 0;
		int diet = 0;
		int week = 1;
		
		System.out.print("현재 몸무게 >> ");
		weight = scan.nextInt();
		System.out.print("목표 몸무게 >> ");
		newWeight = scan.nextInt();
		
		while(true) {
			
			System.out.print(week+"주차 감량 몸무게 >> ");
			diet = scan.nextInt();
			weight -= diet;
			if(weight <= newWeight) {
				System.out.println(weight+"kg 달성!! 축하합니다~!");
				break;
			}
			week++;
			
		}
		scan.close();
		
	}

}
