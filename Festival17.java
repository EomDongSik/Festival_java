import java.util.Scanner;

public class Festival17 {

	public static void main(String[] args) {
		// ���� n�� �Է¹޾� 1,2,4,7,11�� ���� ������ n��° �ױ��� ���
		Scanner scan = new Scanner(System.in);
		int input = 0;
		int a = 1;
		System.out.print("N �� �Է� >> ");
		input = scan.nextInt();
		
		for(int i=0; i<input; i++) {
			
			a += i; //i��° i���ϱ�
			System.out.print(a+" ");
			
		}
		scan.close();
	}

}
