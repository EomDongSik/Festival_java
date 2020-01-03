import java.util.Scanner;

public class Festival34 {

	public static void main(String[] args) {
		// 문자열 형태의 2진수를 입력 받아 10진수로 바꾸는 프로그램
		String str = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("2진수 입력 --> ");
		str = scan.next();
		
		//문자열로 받음
		int a = 1; //2배씩 곱하기 위해서 만든 변수
		int sum = 0; //10진수로 표현
		String array[] = str.split("");
		for(int i=array.length-1; i>=0; i--) {
			
			if(array[i].equals("1")) {
				sum += 1*a;
			}
			a*=2;
	
		}
		//출력
		System.out.println(str+"(2) = "+sum+"(10)");
		scan.close();
	}
}
