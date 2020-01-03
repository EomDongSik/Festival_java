import java.util.Scanner;

public class Festival19 {

	public static void main(String[] args) {
		//하샤드 수
		//보너스3번 (15분/37점)
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
	
		num = scan.nextInt();
		
		System.out.println(isHarshad(num));
		scan.close();
	}
	public static boolean isHarshad(int num) {
		
		int sum = 0; //각 자리 수 더하기
		int numB = 0; //원래 넘버 저장
		
		while (true) {// 몇 번 돌릴 지 모르니까

			sum = sum + (num % 10); // 일의 자리수만 빼서 더하기

			if (num / 10 == 0) {// 일의 자리만 있다면 종료

				break;
			}
			num /= 10; // 아니면 몫으로만 다시 num으로 반환

		}
		boolean a = numB % sum == 0 ? true : false;

		return a;
	}

}
