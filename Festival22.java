import java.util.Scanner;

public class Festival22 {

	public static void main(String[] args) {
		// 멀리뛰기
		//0>0 1>1 2>2 3>3 4>5 5>8 6>13 7>21 피보나치 수열처럼 나옴
		Scanner scan = new Scanner(System.in);
		int num = 0; //칸 변수
		int x = 0; // 전 값 저장
		int y = 1; // 현재 더 해지는 값
		int result = 0; //현재 값
		
		num = scan.nextInt(); //칸 입력
		
		for (int i=0; i<=num; i++) {
			
			x = result;
			result = x+y;
			y = x;
			
		}
		System.out.println(result);
		scan.close();
	}

}
