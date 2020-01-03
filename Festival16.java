import java.util.Random;

public class Festival16 {

	public static void main(String[] args) {
		// 중복이 없이 숫자를 뽑는 로또 프로그램을 만드시오
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
			System.out.println("행운의숫자 : " + temp);
		}
	}

}
