import java.util.Scanner;

public class Festival23 {

	public static void main(String[] args) {
		// ���μ� ���ظ� ���ִ� ���α׷�
		// 19�� (20��/35��)
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.print("���μ����� �� ���� �Է��ϼ��� >> ");
		num = scan.nextInt();
		
		System.out.print(num+" = "); //��� ���� ���
		while (true) { //����� �������� �� �𸣴ϱ� while
			
			for (int i = 2; i <= num; i++) {//1���� ���� �ʿ� ����, num�� �Է¼�
				if(num%i==0) {
					System.out.print(i);
					num = num/i;//i���� �������ٸ� num�� �����������
					break;
				}
			}
			if(num==1) {// �׳� 1�� �Է����� ���� �ٷ� break
				break;
			}
			System.out.print("*");//for���� �ѹ��ϰ� �ȳ����� ����ó�� ������ ��
			
		}
		scan.close();
	}

}
