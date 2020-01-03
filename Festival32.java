import java.util.Scanner;

public class Festival32 {

	public static void main(String[] args) {
		// 1,2,4 나라 change124메소드
		// 27번 (30분/40점)
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		//입력
		System.out.print("수 입력>> ");
		num = scan.nextInt();
		
		System.out.println(change124(num));
		scan.close();
	}
	
	public static int change124(int num) {
		
		int result = 0; //3나누어서 판별하기위해서
		int cnt = 0;
		int a = 3;
		int sum = 3;
		int output = 0;
		
		while (true) {//for문 어디까지 돌려야 할 지 확인

			if ((num - 1) / sum == 0) {
				break;
			}
			cnt++; //자리수를 어디까지 할지 체크
			a *= a; //제곱수 만들기 3, 3*3, 3*3*3
			sum += a; //3진수이기 때문에 3, 3+3제곱 일 때 자리수가 바뀐다

		}

		int[] array = new int[cnt + 1]; //그 개수만큼 배열 만들기 자리 수 만들기
										//+1한 이유는 0에서 break될 수 도 있어서
		for (int i = 0; i <= cnt; i++) {

			if (num == 0) { //0을 입력하면 아래로 가면 4가 되기때문에 멈춘다
				break;
			}
			result = num % 3;

			if (result == 0) {//1의자리부터 차례로 넣기
				array[i] = 4;
			} else if (result == 1) {
				array[i] = 1;
			} else if (result == 2) {
				array[i] = 2;
			}

			num = (num - 1) / 3; //나눈 몫을 체크 
			//num-1을 한 이유는 3같은 경우 4이지만 몫이 1이 되기때문에 이런 경우 없애기 위해서

		}
		int count = 1; //자리수마다 10을 곱해서 더해서 출력하기위해
		for (int i = 0; i <= cnt; i++) {
			
			output += array[i]*count;
			count*=10;
		}
		return output;
	}

}
