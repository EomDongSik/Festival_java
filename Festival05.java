import java.util.Scanner;

public class Festival05 {

	public static void main(String[] args) {
		// 행 개수를 입력 받아 삼각형을 출력
		
		Scanner scan = new Scanner(System.in);
		int row = 0;
		
		System.out.print("행 개수>> ");
		row = scan.nextInt();
		
		for(int line = 1; line <= row; line++) {
			for(int star = 1; star<=line; star++) {
				System.out.print("*");
			}System.out.println("");
		}
		scan.close();
	}

}
