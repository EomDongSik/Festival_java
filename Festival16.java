import java.util.Random;

public class Festival16 {

	public static void main(String[] args) {
		// �ߺ��� ���� ���ڸ� �̴� �ζ� ���α׷��� ����ÿ�
		Random rd = new Random();
		int[] num = new int[6];
		
		for (int i = 0; i<num.length; i++) {
			num[i] = rd.nextInt(45)+1;
			
			for(int j=0; j<i; j++) {
				
				if (num[i] == num[j]) {
						i--;
						break;
				}
			}
			
		}
		for(int temp : num) {
			System.out.println("����Ǽ��� : " + temp);
		}
	}

}
