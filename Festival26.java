import java.util.Scanner;

public class Festival26 {

	public static void main(String[] args) {
		// 5개의 정수를 입력 받아 오름차순 정렬하여 출력
		// 22번 (15분/35점)
		Scanner scan = new Scanner(System.in);
		int[] array = new int[5];
		

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번째 수 입력>> ");
			array[i] = scan.nextInt();
		}
		System.out.println("정렬 후");

		// 인덱스 선택정렬
		for (int i = 0; i < 4; i++) {
			int index = i;
			for (int j = i+1; j < 5; j++) {
				if (array[index] > array[j]) {
					index = j;
				}

			}
			int temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
		
	
		// 출력
		for (int i = 0; i < 5; i++) {
			System.out.print(array[i] + " ");
		}
		scan.close();
	}

}
