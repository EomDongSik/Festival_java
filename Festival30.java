import java.util.Scanner;

public class Festival30 {

	public static void main(String[] args) {
		// ���('_')���ڷ� ������ ������ ���ڸ� �־��� ���ڿ� ���� ����ϰ� ���� �� ����� ����
		// 25�� (25��/40��)
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
		System.out.print("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >> ");
		num = scan.nextInt();
		
		
		while(true) {//�뽬 �������� ����� ���� �����
			
			if(num%10==0||num%10==6||num%10==9) {
				sum += 6;
			}
			if(num%10==1) {
				sum += 2;
			}
			if(num%10==2||num%10==3||num%10==5) {
				sum += 5;
			}
			if(num%10==4) {
				sum += 4;
			}
			if(num%10==7) {
				sum += 3;
			}
			if(num%10==8) {
				sum += 7;
			}
			if(num/10==0) {
				break;
			}
			num /=10;
			
		}
		System.out.println("���('_')�� �� ��>> "+sum);
		scan.close();
	}

}
