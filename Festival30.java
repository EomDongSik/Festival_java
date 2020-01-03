import java.util.Scanner;

public class Festival30 {

	public static void main(String[] args) {
		// 대시('_')문자로 구성된 형태의 숫자를 주어진 숫자와 같이 출력하고 싶을 때 대시의 개수
		// 25번 (25분/40점)
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		num = scan.nextInt();
		
		
		while(true) {//대쉬 개수마다 경우의 수를 만든다
			
			if(num%10==0||num%10==6||num%10==9) {
				sum += 6;
			}
			if(num%10==1) {
				sum += 2;
			}
			if(num%10==2||num%10==3||num%10==5) {
				sum += 5;
			}
			if(num%10==4) {
				sum += 4;
			}
			if(num%10==7) {
				sum += 3;
			}
			if(num%10==8) {
				sum += 7;
			}
			if(num/10==0) {
				break;
			}
			num /=10;
			
		}
		System.out.println("대시('_')의 총 합>> "+sum);
		scan.close();
	}

}
