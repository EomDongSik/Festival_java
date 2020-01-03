import java.util.Scanner;

public class Festival08 {

	public static void main(String[] args) {
		// 김서방 찾기
		String[] names = {"Queen", "Tod", "Kim"};
		System.out.println(findKim(names));
		
	}
	public static String findKim(String[] names) {
		
		int cnt = 0;
		String name = "";
		
		for(String temp : names) {
			cnt++;
			if(temp.equals("Kim")) {
				name = "김서방은 "+cnt+"에 있다.";
			}
		}
		
		return name;
	}
}
