import java.util.Scanner;

public class Festival26 {

	public static void main(String[] args) {
		// 5���� ������ �Է� �޾� �������� �����Ͽ� ���
		// 22�� (15��/35��)
		Scanner scan = new Scanner(System.in);
		int[] array = new int[5];
		

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "��° �� �Է�>> ");
			array[i] = scan.nextInt();
		}
		System.out.println("���� ��");

		// �ε��� ��������
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
		
	
		// ���
		for (int i = 0; i < 5; i++) {
			System.out.print(array[i] + " ");
		}
		scan.close();
	}

}
