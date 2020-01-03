public class Festival33 {

	public static void main(String[] args) {
		// 알파벳 순서대로 모래시계 모양대로 출력하는 코드 작성 출력
		// 보너스 6번 (30분/60점)
		String[] alphas = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q" };
		//알파벳 입력
		int count = 0;//출력카운트
		int h = 0;//출력어디까지 했는지 기록
		for(int i=0; i<=2; i++) {
			//공백 부분
			for(int k=0; k<i; k++) {//행 0번째 때는 공백 부분 0개, 실행 한번도 안하게 함
				System.out.print(" ");
			}
			h= count;
			for(int j=0 ; j<5-2*i; j++) {
				System.out.print(alphas[j+h]);
				count++;//몇번째까지 출력했는지 알아야니까 그것을 h에 저장
			}
			System.out.println("");
		}
		//아래 부분 출력
		for(int i=1; i>=0; i--) {
			
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			h = count;
			for(int j=0 ; j<5-2*i; j++) {//행의 요소 개수(열)가 5개니까 5-양쪽 잘라지는 부분 2배 2*i
				System.out.print(alphas[j+h]);
				count++;
			}
			System.out.println("");
		}
		
		
		
	}
}
