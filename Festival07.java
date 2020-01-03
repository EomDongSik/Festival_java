import java.util.Scanner;

public class Festival07 {

	public static void main(String[] args) {
		// 행 개수를 입력 받아 역삼각형 출력
		Scanner scan = new Scanner(System.in);
		int row = 0;
		
		System.out.print("행 개수>> ");
		row = scan.nextInt();
		
		for(int line = row; line >= 1; line--) {
			for(int star = line; star>=1; star--) {
				System.out.print("*");
			}System.out.println("");
		}
		scan.close();

	}

}
