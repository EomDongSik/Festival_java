import java.util.Scanner;

public class Festival09 {

	public static void main(String[] args) {
		// 정수를 입력 받아 1의 자리에서 반올림 한 결과를 출력
		Scanner scan =  new Scanner(System.in);
		int input = 0;
		int result = 0;
		double dev = 0;
		
		System.out.print("숫자 입력 >> ");
		input = scan.nextInt();
		
		dev = input/(10.0);
		result = (int)dev;
		result *=10;
		
		if(input-result>=5) {
			result +=10;
		}
		System.out.println("반올림 수 >> "+result);
		scan.close();
	}

}
