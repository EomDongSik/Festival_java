import java.util.Scanner;

public class Festival14 {

	public static void main(String[] args) {
		//��� ���� ���ϱ�
		Scanner scan = new Scanner(System.in);
		String noun = "";
		System.out.print("�Է�-->");
		noun = scan.next();
		
		System.out.println(getMiddle(noun));
		//String n = noun.substring(1,3); �Լ�����
		
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
