public class Festival33 {

	public static void main(String[] args) {
		// ���ĺ� ������� �𷡽ð� ����� ����ϴ� �ڵ� �ۼ� ���
		// ���ʽ� 6�� (30��/60��)
		String[] alphas = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q" };
		//���ĺ� �Է�
		int count = 0;//���ī��Ʈ
		int h = 0;//��¾����� �ߴ��� ���
		for(int i=0; i<=2; i++) {
			//���� �κ�
			for(int k=0; k<i; k++) {//�� 0��° ���� ���� �κ� 0��, ���� �ѹ��� ���ϰ� ��
				System.out.print(" ");
			}
			h= count;
			for(int j=0 ; j<5-2*i; j++) {
				System.out.print(alphas[j+h]);
				count++;//���°���� ����ߴ��� �˾ƾߴϱ� �װ��� h�� ����
			}
			System.out.println("");
		}
		//�Ʒ� �κ� ���
		for(int i=1; i>=0; i--) {
			
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			h = count;
			for(int j=0 ; j<5-2*i; j++) {//���� ��� ����(��)�� 5���ϱ� 5-���� �߶����� �κ� 2�� 2*i
				System.out.print(alphas[j+h]);
				count++;
			}
			System.out.println("");
		}
		
		
		
	}
}
