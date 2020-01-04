import java.util.Arrays;
import java.util.Scanner;

public class Festival18 {

	public static void main(String[] args) {
		//알파벳을 입력받아 알파벳 정렬
		Scanner scan = new Scanner(System.in);
		String alpha = "";
		System.out.print("입력 >>");
		alpha = scan.next();
		
		String[] alphas = alpha.split("");
		Arrays.sort(alphas);
		for(int i = 0; i<alphas.length; i++) {
			System.out.print(alphas[i]);
		}
		scan.close();
	}

}
