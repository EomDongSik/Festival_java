import java.util.Scanner;

public class Festival10 {

	public static void main(String[] args) {
		// �� ������ �Է¹޾� �ִ�����&�ּҰ���� ���
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		int greatC = 0; //�ִ�����
		int leastC = 1; //�ּҰ����
		
		System.out.println("�ִ� �����&�ּ� ����� ���ϱ�");
		System.out.print("����1�Է�>> ");
		num1 = scan.nextInt();
		System.out.print("����2�Է�>> ");
		num2 = scan.nextInt();
		
		if(num1<num2) {//ū���� ���� �� �ٲٱ�
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for(int i=1; i<=num2; i++) {
			
			if( (num2%i==0) && (num1%i==0) ) {
				greatC = i;//�ִ� ����� ���ϱ�
			}
		}
		
		leastC = num1*num2/greatC; //�ִ� �����
		
		System.out.println("�ִ�����>> "+greatC);
		System.out.println("�ּҰ����>> "+leastC);
		scan.close();
	}

}
