import java.util.Scanner;

public class Festival08 {

	public static void main(String[] args) {
		// �輭�� ã��
		String[] names = {"Queen", "Tod", "Kim"};
		System.out.println(findKim(names));
		
	}
	public static String findKim(String[] names) {
		
		int cnt = 0;
		String name = "";
		
		for(String temp : names) {
			cnt++;
			if(temp.equals("Kim")) {
				name = "�輭���� "+cnt+"�� �ִ�.";
			}
		}
		
		return name;
	}
}
