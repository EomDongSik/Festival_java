import java.util.Scanner;

public class Festival20 {

	public static void main(String[] args) {
		// Collatz ¦����� 2�� ������, Ȧ����� 3�� ���ϰ� 1�� ���� ���� ���
		// ���� ���� ���� �۾��� 1�� �� �� ���� �ݺ��� ��� ��� ���� 1�� �ȴ�.
		// 17�� (15��/30��)
		Scanner scan = new Scanner(System.in);
		int cnt = 0; 
		int num = scan.nextInt();
				
		
		while(true) {
			
			if(num%2==0) {
				num/=2;
			}
			else {
				num = num*3 +1;
			}
			cnt++;
			if(num==1) {
				break;
			}
			if(cnt==500) {
				cnt = -1;
				break;
			}
		}
		System.out.println(cnt);
		scan.close();
	}

}
