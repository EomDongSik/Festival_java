import java.util.Scanner;

public class Festival02 {

	public static void main(String[] args) {
		// ���� �ð��� �Է¹޾� �� �ӱ��� ����ϴ� �ñ� ����
		// �� �ñ� 5000���̸� 8�ð����� �ʰ� �ٹ��� �ð��� ���� 1.5�� �ñ� å��
		
		Scanner scan = new Scanner(System.in);
		int money = 5000;
		int time = 0;
		int overTime = 8;
		int result = 0;
		double rate = 1.5;
		
		System.out.print("���ѽð��� �Է��ϼ���>> ");
		time = scan.nextInt();
		
		if(time > overTime) {
			result = money * overTime + (int)(money*(time-overTime)*rate);
		}
		else {
			result = money*time;
		}
		
		System.out.println("�� �ӱ��� "+result+"�� �Դϴ�.");
		
		scan.close();
		
		

	}

}
