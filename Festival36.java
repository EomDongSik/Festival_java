
public class Festival36 {

	public static void main(String[] args) {
		//30�� (40��/45��) 2���� �迭�� �Ʒ��� ���� ���̾Ƹ�����·� ���
		int [][] array = new int[7][7]; //2���� �迭 ����
		int a = 3; //3�� �������� 1�� �Էµ� 0���� ����
		int b = 0; //b�� ����
		int cnt = 1; //������ŭ cnt ���� �Է�
		for(int j = 0; j<7; j++) { //7*7�̱� ������  7�� ����
			
			for(int i = a-b; i<=a+b; i++) { //���� 3���� �� �� �Ʒ� ������ b�� ������
				
				array[i][j]=cnt; // �Է�
				cnt++;
			}
			if(j<3) {//���� 3���� ���� ���� b���� ����
				b++;
			}
			else {// �׷��� �ʴٸ� b���� ����
				b--;
			}
		}
		
		//���
		for(int i =0; i<7; i++) {
			
			for(int j = 0; j<7; j++) {
				System.out.print(array[i][j]+"\t");
			}System.out.println("");
			
		}
	}

}
