import java.util.Scanner;

public class Festival21 {

	public static void main(String[] args) {
		// 정수 N을 입력받아 N*N배열에 다음과 같이 숫자를 저장하고 출력
		// 18번 (15분/30점)
		Scanner scan = new Scanner(System.in);
		int N = 0;

		System.out.print("N 입력 >> ");
		N = scan.nextInt();
		int array[] = new int[N * N];

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {

				if (i % 2 != 0) {
					array[N * (i - 1) + j - 1] = N * (i - 1) + j;
				} else {
					array[N * (i - 1) + j - 1] = N * i - j + 1;
				}
			}

		}
		for(int i=0; i<N*N; i++) {
			System.out.print(array[i]+"\t");
			if((i+1)%N==0) {
				System.out.println("");
			}
		}
		scan.close();

	}

}
