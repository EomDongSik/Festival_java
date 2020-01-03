import java.util.Scanner;

public class Festival24 {

	public static void main(String[] args) {
		// 10진수 정수를 입력받아 2진수로 변환해서 출력
		// 20번 (20분/35점)
		Scanner scan = new Scanner(System.in);
		int numB = 0; // 정수 보존 변수
		int num = 0; // 정수 입력 변수
		int cnt = 0;
		int result = 0;
		//입력
		System.out.print("숫자 입력 >> "); 
		num = scan.nextInt();
		
		numB = num; //원래 입력한 숫자 보존

		while (true) {

			if (num < 2) {
				break;
			}
			num /= 2; //2로 나누어 떨어질 때 자리수 바뀜
			cnt++; //자리수 체크용
		}

		num = numB; //num을 계속 나누었기 때문에 다시 원래대로 바꿈

		for (int i = cnt; i >= 0; i--) {//최고자리 수부터 확인하기위해 cnt부터
			int a = 2; // 초기화
			for (int j = 1; j < i; j++) {//cnt까지 제곱수 구하기
				a *= 2;
			}
			result = num / a == 1 ? 1 : 0; // 나누었을때 해당사항은 1로됨
			if(num==1&&i==0) {//만약에 일의자리일때 0과 1은 구분이 안되기 때문에 그 값은 1로 고정
				result =1;
			}
			System.out.print(result);//최고자리부터 계속 출력
			if(result == 1) {
				num -= a;
			}//해당 result가 1이되면 나누어졌기 때문에 그 a값을 빼줘야 됨
			 
			System.out.println(num);
			
		}
		scan.close();

	}

}
