import java.util.Scanner;

public class Festival15 {

	public static void main(String[] args) {
		// 정수형 변수 input을 선언하고 피보나치 수열의 input번째 항까지 출력
		Scanner scan = new Scanner(System.in);
		int N = 0;
		int a = 1;
		int b = 0;
		int result = 1;
		
		System.out.print("N입력 >> ");
		N = scan.nextInt();
		
		for(int i=0; i<N; i++) {
			
			System.out.print(result +" ");
			
			a = result; //바로 직전의 수
			result = a+b; //계산
			b = a; //순서 중요 직전의직전의 수
		}
		scan.close();
	}

}
