
import java.util.Scanner;

public class Festival37 {

	public static void main(String[] args) {
		//31��  (60��/45��)���� �����ް� �� ���� ���� ���� ���ӵ� ���� ���� ���� ��
		Scanner scan = new Scanner(System.in);
		int num = 0; //�ڿ���
		int count = 0; //Ƚ�� ����
		
		while(true) {
			System.out.print("�ڿ��� �Է� >> ");
			num = scan.nextInt();
			if(num>0) {
				break;
			}else {
				System.out.println("�ڿ����� �Է��ϼ���!");
			}
			scan.close();
		}//�Է°� �ޱ�
		
		
		for(int i=1; i<=num; i++) {//�ڽŵ� �����ϴϱ� �Է��� ������
			for(int j=i, sum=0; j<=num; j++) { //���������� ��� �ٲ�
				sum +=j; //�� �������� ���ϸ鼭 �´� ������ �ִٸ� 
				if(sum==num) {
					count +=1;	//�������� ���Ѵ�
				}
			}
		}
		System.out.println(count + "����");
		
	}

}
