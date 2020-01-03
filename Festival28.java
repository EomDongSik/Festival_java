
public class Festival28 {

	public static void main(String[] args) {
		// 아래와 같은 2차원 배열을 왼쪽으로 회전
		// 23번 (25분/40점)
		int arr[][] = new int[5][5];
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = 5*i+j+1;			}
		}
		
		for(int j=4; j>=0; j--) {
			for(int i =4; i>=0; i--) {
				
				System.out.print(arr[4-i][j]+"\t") ;
			}System.out.println("");
		}

	}

}
