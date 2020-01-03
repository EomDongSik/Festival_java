import java.util.Random;

public class Festival35 {

	public static void main(String[] args) {
		// 1~99사이의 숫자를 랜덤으로 8*8의 배열에 담고, 최대값을 가지는 숫자와 그 행과 열을 출력하는 프로그램
		// 단, 최대값을 2개일 경우 먼저 나온 숫자의 행과 열로 계산
		// 29번 (30분/45점)
		Random rd = new Random(); //랜덤함수
		int array[][] = new int[8][8]; //배열 정의 및 초기화
		int index[][] = new int[1][2]; //최대값의 index기록하기위해 변수 정의
		
		//입력
		for(int i=0; i<8; i++) {
			
			for(int j=0; j<8; j++) {
				array[i][j] = rd.nextInt(99)+1;
			}
		}
		//판별
		for(int i=0; i<8; i++) {
			
			for(int j=0; j<8; j++) {
				
				if(array[index[0][0]][index[0][1]]-array[i][j]<0) { //내가 기록해둔 값보다 더 큰지 비교
					index[0][0] = i;
					index[0][1] = j;
				}
			}
			
		}
		//배열에 있는 값 출력
		System.out.println("배열에 있는 값");
		for(int i=0; i<8; i++) {
			
			for(int j=0; j<8; j++) {
				System.out.print(array[i][j]+"\t");
			}System.out.println("");
		}
		
		//결과 값 출력
		System.out.println("최대값 >> "+array[index[0][0]][index[0][1]]);
		System.out.println("행 >> "+(index[0][0]+1)+"  열 >> "+(index[0][1]+1));
		
	}

}
