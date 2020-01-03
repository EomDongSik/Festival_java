
import java.util.Scanner;

public class Festival37 {

	public static void main(String[] args) {
		//31번  (60분/45점)수를 지정받고 그 수에 대한 값을 연속된 수의 합의 가지 수
		Scanner scan = new Scanner(System.in);
		int num = 0; //자연수
		int count = 0; //횟수 세기
		
		while(true) {
			System.out.print("자연수 입력 >> ");
			num = scan.nextInt();
			if(num>0) {
				break;
			}else {
				System.out.println("자연수를 입력하세요!");
			}
			scan.close();
		}//입력값 받기
		
		
		for(int i=1; i<=num; i++) {//자신도 포함하니까 입력한 수까지
			for(int j=i, sum=0; j<=num; j++) { //시작지점을 계속 바꿈
				sum +=j; //그 지점부터 더하면서 맞는 구간이 있다면 
				if(sum==num) {
					count +=1;	//가지수를 더한다
				}
			}
		}
		System.out.println(count + "가지");
		
	}

}
