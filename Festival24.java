import java.util.Scanner;

public class Festival24 {

	public static void main(String[] args) {
		// 10���� ������ �Է¹޾� 2������ ��ȯ�ؼ� ���
		// 20�� (20��/35��)
		Scanner scan = new Scanner(System.in);
		int numB = 0; // ���� ���� ����
		int num = 0; // ���� �Է� ����
		int cnt = 0;
		int result = 0;
		//�Է�
		System.out.print("���� �Է� >> "); 
		num = scan.nextInt();
		
		numB = num; //���� �Է��� ���� ����

		while (true) {

			if (num < 2) {
				break;
			}
			num /= 2; //2�� ������ ������ �� �ڸ��� �ٲ�
			cnt++; //�ڸ��� üũ��
		}

		num = numB; //num�� ��� �������� ������ �ٽ� ������� �ٲ�

		for (int i = cnt; i >= 0; i--) {//�ְ��ڸ� ������ Ȯ���ϱ����� cnt����
			int a = 2; // �ʱ�ȭ
			for (int j = 1; j < i; j++) {//cnt���� ������ ���ϱ�
				a *= 2;
			}
			result = num / a == 1 ? 1 : 0; // ���������� �ش������ 1�ε�
			if(num==1&&i==0) {//���࿡ �����ڸ��϶� 0�� 1�� ������ �ȵǱ� ������ �� ���� 1�� ����
				result =1;
			}
			System.out.print(result);//�ְ��ڸ����� ��� ���
			if(result == 1) {
				num -= a;
			}//�ش� result�� 1�̵Ǹ� ���������� ������ �� a���� ����� ��
			 
			System.out.println(num);
			
		}
		scan.close();

	}

}
