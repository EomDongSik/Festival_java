import java.util.Scanner;

public class Festival19 {

	public static void main(String[] args) {
		//�ϻ��� ��
		//���ʽ�3�� (15��/37��)
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
	
		num = scan.nextInt();
		
		System.out.println(isHarshad(num));
		scan.close();
	}
	public static boolean isHarshad(int num) {
		
		int sum = 0; //�� �ڸ� �� ���ϱ�
		int numB = 0; //���� �ѹ� ����
		
		while (true) {// �� �� ���� �� �𸣴ϱ�

			sum = sum + (num % 10); // ���� �ڸ����� ���� ���ϱ�

			if (num / 10 == 0) {// ���� �ڸ��� �ִٸ� ����

				break;
			}
			num /= 10; // �ƴϸ� �����θ� �ٽ� num���� ��ȯ

		}
		boolean a = numB % sum == 0 ? true : false;

		return a;
	}

}
