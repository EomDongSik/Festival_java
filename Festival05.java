import java.util.Scanner;

public class Festival05 {

	public static void main(String[] args) {
		// �� ������ �Է� �޾� �ﰢ���� ���
		
		Scanner scan = new Scanner(System.in);
		int row = 0;
		
		System.out.print("�� ����>> ");
		row = scan.nextInt();
		
		for(int line = 1; line <= row; line++) {
			for(int star = 1; star<=line; star++) {
				System.out.print("*");
			}System.out.println("");
		}
		scan.close();
	}

}
