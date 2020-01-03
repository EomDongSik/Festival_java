import java.util.Scanner;

public class Festival20 {

	public static void main(String[] args) {
		// Collatz 짝수라면 2로 나누고, 홀수라면 3을 곱하고 1을 더한 다음 결과
		// 나온 수에 같은 작업을 1이 될 때 까지 반복할 경우 모든 수가 1이 된다.
		// 17번 (15분/30점)
		Scanner scan = new Scanner(System.in);
		int cnt = 0; 
		int num = scan.nextInt();
				
		
		while(true) {
			
			if(num%2==0) {
				num/=2;
			}
			else {
				num = num*3 +1;
			}
			cnt++;
			if(num==1) {
				break;
			}
			if(cnt==500) {
				cnt = -1;
				break;
			}
		}
		System.out.println(cnt);
		scan.close();
	}

}
