import java.util.Arrays;
import java.util.Scanner;

public class Festival18 {

	public static void main(String[] args) {
		//���ĺ��� �Է¹޾� ���ĺ� ����
		Scanner scan = new Scanner(System.in);
		String alpha = "";
		System.out.print("�Է� >>");
		alpha = scan.next();
		
		String[] alphas = alpha.split("");
		Arrays.sort(alphas);
		for(int i = 0; i<alphas.length; i++) {
			System.out.print(alphas[i]);
		}
		scan.close();
	}

}
