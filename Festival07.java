import java.util.Scanner;

public class Festival07 {

	public static void main(String[] args) {
		// �� ������ �Է� �޾� ���ﰢ�� ���
		Scanner scan = new Scanner(System.in);
		int row = 0;
		
		System.out.print("�� ����>> ");
		row = scan.nextInt();
		
		for(int line = row; line >= 1; line--) {
			for(int star = line; star>=1; star--) {
				System.out.print("*");
			}System.out.println("");
		}
		scan.close();

	}

}
