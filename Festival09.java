import java.util.Scanner;

public class Festival09 {

	public static void main(String[] args) {
		// ������ �Է� �޾� 1�� �ڸ����� �ݿø� �� ����� ���
		Scanner scan =  new Scanner(System.in);
		int input = 0;
		int result = 0;
		double dev = 0;
		
		System.out.print("���� �Է� >> ");
		input = scan.nextInt();
		
		dev = input/(10.0);
		result = (int)dev;
		result *=10;
		
		if(input-result>=5) {
			result +=10;
		}
		System.out.println("�ݿø� �� >> "+result);
		scan.close();
	}

}
