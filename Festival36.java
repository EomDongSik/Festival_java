
public class Festival36 {

	public static void main(String[] args) {
		//30번 (40분/45점) 2차원 배열에 아래와 같이 다이아몬드형태로 출력
		int [][] array = new int[7][7]; //2차원 배열 설정
		int a = 3; //3을 기준으로 1이 입력됨 0부터 시작
		int b = 0; //b는 범위
		int cnt = 1; //돌린만큼 cnt 수를 입력
		for(int j = 0; j<7; j++) { //7*7이기 때문에  7로 설정
			
			for(int i = a-b; i<=a+b; i++) { //행은 3부터 그 위 아래 범위는 b로 결정됨
				
				array[i][j]=cnt; // 입력
				cnt++;
			}
			if(j<3) {//열이 3보다 작을 때는 b범위 증가
				b++;
			}
			else {// 그렇지 않다면 b범위 감소
				b--;
			}
		}
		
		//출력
		for(int i =0; i<7; i++) {
			
			for(int j = 0; j<7; j++) {
				System.out.print(array[i][j]+"\t");
			}System.out.println("");
			
		}
	}

}
