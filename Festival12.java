
public class Festival12 {

	public static void main(String[] args) {
		// �л����� ���������� ���ڿ��� ����Ǿ� ���� �� �� ���� �� �л� �� ���
		String score = "A,A,B,C,D,A,,C,D,D,D,F";
		String scores[] = {"A", "B", "C", "D", "F"};
		int i = 0;
		int cnt[] = new int[5];
		
		String grade[]= score.split(","); // ,�� �߶� �迭�� �ִ´�
		
		for(String temp : scores) {
			for(String temp2 : grade) {
				if(temp.equals(temp2)) {//�ִ��� Ȯ��
					cnt[i]++;
				}
			}i++;
			
		}
		for(int j=0; j<scores.length; j++) {
			System.out.println(scores[j]+" : "+cnt[j]+"��");
			
		}
		
				
						
				
	}

}
