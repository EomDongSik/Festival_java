import java.util.Scanner;

public class Festival01 {

	public static void main(String[] args) {
		// ��������Կ� ��ǥ�����Ը� ���� �Է� �ް� ������ ���������Ը� �Է� �޾� ��ǥ �޼��� ���ϸ޽����� ���� ���α׷�
		
		Scanner scan = new Scanner(System.in);
		int weight = 0;
		int newWeight = 0;
		int diet = 0;
		int week = 1;
		
		System.out.print("���� ������ >> ");
		weight = scan.nextInt();
		System.out.print("��ǥ ������ >> ");
		newWeight = scan.nextInt();
		
		while(true) {
			
			System.out.print(week+"���� ���� ������ >> ");
			diet = scan.nextInt();
			weight -= diet;
			if(weight <= newWeight) {
				System.out.println(weight+"kg �޼�!! �����մϴ�~!");
				break;
			}
			week++;
			
		}
		scan.close();
		
	}

}
