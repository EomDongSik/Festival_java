import java.util.Scanner;

public class Festival23 {

	public static void main(String[] args) {
		// 소인수 분해를 해주는 프로그램
		// 19번 (20분/35점)
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.print("소인수분해 할 수를 입력하세요 >> ");
		num = scan.nextInt();
		
		System.out.print(num+" = "); //출력 순서 고려
		while (true) { //몇번을 나눠야할 지 모르니까 while
			
			for (int i = 2; i <= num; i++) {//1부터 나눌 필요 없어, num은 입력수
				if(num%i==0) {
					System.out.print(i);
					num = num/i;//i수로 나누었다면 num을 나누어줘야지
					break;
				}
			}
			if(num==1) {// 그냥 1을 입력했을 때는 바로 break
				break;
			}
			System.out.print("*");//for문을 한번하고 안끝나면 곱셈처럼 나오게 함
			
		}
		scan.close();
	}

}
