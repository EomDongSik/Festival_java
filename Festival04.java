import java.util.Scanner;

public class Festival04 {

	public static void main(String[] args) {
		// �Ž������� �Է� �޾� ������� �ϴ� ������ ������ ����ϴ� ���α׷�
		// ��, �ִ������ 10000��, �ּҴ����� 100��
		
		Scanner scan = new Scanner(System.in);
		int[] moneyNames = {10000, 5000, 1000, 500, 100};
		int money = 0;
		int result = 0;
		
		System.out.print("�ѱݾ� �Է�>> ");
		money = scan.nextInt();
		
		System.out.println("�ܵ� >> "+money);
		for (int i=0; i<moneyNames.length; i++) {
			
			result = money/moneyNames[i];
			System.out.println(moneyNames[i]+"�� >> "+result+"��");
			money = money- result*moneyNames[i];
		}
		scan.close();
	}

}
