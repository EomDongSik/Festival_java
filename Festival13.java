import java.util.Scanner;

public class Festival13 {

	public static void main(String[] args) {
		// 정수 N을 입력받아 N*N배열에 다음과 같이 숫자 저장 출력
		Scanner scan = new Scanner(System.in);
		int N = 0;
		
		System.out.print("N입력 >> ");
		N = scan.nextInt();
		int[] numbers = new int[N*N];
		
		for(int i = 1; i<=N; i++) {
			for(int j = 1; j<=N; j++) {
				
				numbers[N*(i-1)+j-1] = (j-1)*N+i;
			}
		}
		for(int i = 0; i < N*N; i++) {
			System.out.print(numbers[i]+"\t");
			if((i+1)%N==0) {
				System.out.println("");
			}
		}
		scan.close();

	}

}
