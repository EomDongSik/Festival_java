import java.util.Scanner;

public class Festival34 {

	public static void main(String[] args) {
		// ���ڿ� ������ 2������ �Է� �޾� 10������ �ٲٴ� ���α׷�
		String str = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("2���� �Է� --> ");
		str = scan.next();
		
		//���ڿ��� ����
		int a = 1; //2�辿 ���ϱ� ���ؼ� ���� ����
		int sum = 0; //10������ ǥ��
		String array[] = str.split("");
		for(int i=array.length-1; i>=0; i--) {
			
			if(array[i].equals("1")) {
				sum += 1*a;
			}
			a*=2;
	
		}
		//���
		System.out.println(str+"(2) = "+sum+"(10)");
		scan.close();
	}
}
