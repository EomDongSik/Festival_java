import java.util.Scanner;

public class Festival17 {

	public static void main(String[] args) {
		// 정수 n을 입력받아 1,2,4,7,11과 같은 수열의 n번째 항까지 출력
		Scanner scan = new Scanner(System.in);
		int input = 0;
		int a = 1;
		System.out.print("N 번 입력 >> ");
		input = scan.nextInt();
		
		for(int i=0; i<input; i++) {
			
			a += i; //i번째 i더하기
			System.out.print(a+" ");
			
		}
		scan.close();
	}

}
