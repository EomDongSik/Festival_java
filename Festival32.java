import java.util.Scanner;

public class Festival32 {

	public static void main(String[] args) {
		// 1,2,4 ���� change124�޼ҵ�
		// 27�� (30��/40��)
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		//�Է�
		System.out.print("�� �Է�>> ");
		num = scan.nextInt();
		
		System.out.println(change124(num));
		scan.close();
	}
	
	public static int change124(int num) {
		
		int result = 0; //3����� �Ǻ��ϱ����ؼ�
		int cnt = 0;
		int a = 3;
		int sum = 3;
		int output = 0;
		
		while (true) {//for�� ������ ������ �� �� Ȯ��

			if ((num - 1) / sum == 0) {
				break;
			}
			cnt++; //�ڸ����� ������ ���� üũ
			a *= a; //������ ����� 3, 3*3, 3*3*3
			sum += a; //3�����̱� ������ 3, 3+3���� �� �� �ڸ����� �ٲ��

		}

		int[] array = new int[cnt + 1]; //�� ������ŭ �迭 ����� �ڸ� �� �����
										//+1�� ������ 0���� break�� �� �� �־
		for (int i = 0; i <= cnt; i++) {

			if (num == 0) { //0�� �Է��ϸ� �Ʒ��� ���� 4�� �Ǳ⶧���� �����
				break;
			}
			result = num % 3;

			if (result == 0) {//1���ڸ����� ���ʷ� �ֱ�
				array[i] = 4;
			} else if (result == 1) {
				array[i] = 1;
			} else if (result == 2) {
				array[i] = 2;
			}

			num = (num - 1) / 3; //���� ���� üũ 
			//num-1�� �� ������ 3���� ��� 4������ ���� 1�� �Ǳ⶧���� �̷� ��� ���ֱ� ���ؼ�

		}
		int count = 1; //�ڸ������� 10�� ���ؼ� ���ؼ� ����ϱ�����
		for (int i = 0; i <= cnt; i++) {
			
			output += array[i]*count;
			count*=10;
		}
		return output;
	}

}
