import java.util.Scanner;

public class Festival22 {

	public static void main(String[] args) {
		// �ָ��ٱ�
		//0>0 1>1 2>2 3>3 4>5 5>8 6>13 7>21 �Ǻ���ġ ����ó�� ����
		Scanner scan = new Scanner(System.in);
		int num = 0; //ĭ ����
		int x = 0; // �� �� ����
		int y = 1; // ���� �� ������ ��
		int result = 0; //���� ��
		
		num = scan.nextInt(); //ĭ �Է�
		
		for (int i=0; i<=num; i++) {
			
			x = result;
			result = x+y;
			y = x;
			
		}
		System.out.println(result);
		scan.close();
	}

}
