import java.util.Scanner;

public class Festival15 {

	public static void main(String[] args) {
		// ������ ���� input�� �����ϰ� �Ǻ���ġ ������ input��° �ױ��� ���
		Scanner scan = new Scanner(System.in);
		int N = 0;
		int a = 1;
		int b = 0;
		int result = 1;
		
		System.out.print("N�Է� >> ");
		N = scan.nextInt();
		
		for(int i=0; i<N; i++) {
			
			System.out.print(result +" ");
			
			a = result; //�ٷ� ������ ��
			result = a+b; //���
			b = a; //���� �߿� ������������ ��
		}
		scan.close();
	}

}
