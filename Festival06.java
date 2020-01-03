
public class Festival06 {

	public static void main(String[] args) {
		// (77*1) + (76*2) + (75*3) +...+ (1*77)를 계산하여 결과를 출력
		
		int result = 0;
		for(int i=1; i<=77; i++) {
			result += (78-i)*i;
		}
		System.out.println(result);
		
	}

}
