
public class Festival03 {

	public static void main(String[] args) {
		// 1-2+3-4+...+99-100�� ����Ͽ� ���� ���
		
		int a = -1;
		int sum = 0;
		
		for(int i=1, j=0; i<=100; i++) {
			
			a *= -1;
			j = i*a;
			sum += j;
			System.out.print(j+" ");
			
		}
		System.out.println("");
		System.out.print("��� >>" +sum);
		
	}

}
