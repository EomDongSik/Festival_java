import java.util.Random;

public class Festival35 {

	public static void main(String[] args) {
		// 1~99������ ���ڸ� �������� 8*8�� �迭�� ���, �ִ밪�� ������ ���ڿ� �� ��� ���� ����ϴ� ���α׷�
		// ��, �ִ밪�� 2���� ��� ���� ���� ������ ��� ���� ���
		// 29�� (30��/45��)
		Random rd = new Random(); //�����Լ�
		int array[][] = new int[8][8]; //�迭 ���� �� �ʱ�ȭ
		int index[][] = new int[1][2]; //�ִ밪�� index����ϱ����� ���� ����
		
		//�Է�
		for(int i=0; i<8; i++) {
			
			for(int j=0; j<8; j++) {
				array[i][j] = rd.nextInt(99)+1;
			}
		}
		//�Ǻ�
		for(int i=0; i<8; i++) {
			
			for(int j=0; j<8; j++) {
				
				if(array[index[0][0]][index[0][1]]-array[i][j]<0) { //���� ����ص� ������ �� ū�� ��
					index[0][0] = i;
					index[0][1] = j;
				}
			}
			
		}
		//�迭�� �ִ� �� ���
		System.out.println("�迭�� �ִ� ��");
		for(int i=0; i<8; i++) {
			
			for(int j=0; j<8; j++) {
				System.out.print(array[i][j]+"\t");
			}System.out.println("");
		}
		
		//��� �� ���
		System.out.println("�ִ밪 >> "+array[index[0][0]][index[0][1]]);
		System.out.println("�� >> "+(index[0][0]+1)+"  �� >> "+(index[0][1]+1));
		
	}

}
