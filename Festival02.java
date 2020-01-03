import java.util.Scanner;

public class Festival02 {

	public static void main(String[] args) {
		// 일한 시간을 입력받아 총 임금을 계산하는 시급 계산기
		// 단 시급 5000원이며 8시간보다 초과 근무한 시간에 대한 1.5배 시급 책정
		
		Scanner scan = new Scanner(System.in);
		int money = 5000;
		int time = 0;
		int overTime = 8;
		int result = 0;
		double rate = 1.5;
		
		System.out.print("일한시간을 입력하세요>> ");
		time = scan.nextInt();
		
		if(time > overTime) {
			result = money * overTime + (int)(money*(time-overTime)*rate);
		}
		else {
			result = money*time;
		}
		
		System.out.println("총 임금은 "+result+"원 입니다.");
		
		scan.close();
		
		

	}

}
