import java.util.Scanner;

public class Festival21 {

	public static void main(String[] args) {
		// ���� N�� �Է¹޾� N*N�迭�� ������ ���� ���ڸ� �����ϰ� ���
		// 18�� (15��/30��)
		Scanner scan = new Scanner(System.in);
		int N = 0;

		System.out.print("N �Է� >> ");
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
