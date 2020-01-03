import java.util.Scanner;

public class Festival10 {

	public static void main(String[] args) {
		// 두 정수를 입력받아 최대공약수&최소공배수 출력
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		int greatC = 0; //최대공약수
		int leastC = 1; //최소공배수
		
		System.out.println("최대 공약수&최소 공배수 구하기");
		System.out.print("숫자1입력>> ");
		num1 = scan.nextInt();
		System.out.print("숫자2입력>> ");
		num2 = scan.nextInt();
		
		if(num1<num2) {//큰수와 작은 수 바꾸기
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for(int i=1; i<=num2; i++) {
			
			if( (num2%i==0) && (num1%i==0) ) {
				greatC = i;//최대 공약수 구하기
			}
		}
		
		leastC = num1*num2/greatC; //최대 공배수
		
		System.out.println("최대공약수>> "+greatC);
		System.out.println("최소공배수>> "+leastC);
		scan.close();
	}

}
