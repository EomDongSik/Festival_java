import java.util.Scanner;

public class Festival14 {

	public static void main(String[] args) {
		//가운데 글자 구하기
		Scanner scan = new Scanner(System.in);
		String noun = "";
		System.out.print("입력-->");
		noun = scan.next();
		
		System.out.println(getMiddle(noun));
		//String n = noun.substring(1,3); 함수예시
		
		scan.close();
		
				
	}
	public static String getMiddle(String a) {
		
		String[] b = a.split("");
		
		if(b.length%2==0) {
			
			return b[b.length/2-1]+b[b.length/2];
		}
		else {
			return b[b.length/2];
		}
			
		
	}

}
