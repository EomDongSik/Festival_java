
public class Festival25 {

	public static void main(String[] args) {
		// 아래와 같이 1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 점(index)들을 출력
		// (단, 점들 사이의 거리는 모두 다르다)
		// 21번 (20분/35점)
		int[] point = {92, 32, 52, 9, 81, 2, 68};
		int[] result = {0,1};
		int check = 0;
		
		
		for(int i = 0; i<point.length-1; i++) {
			
			check = point[result[0]] - point[result[1]]; //기준점 정하기
			check = check>=0?check:check*(-1);
			for(int j = i+1; j<point.length; j++) {
				
				int disT = point[i]-point[j];
				disT = disT>=0?disT:disT*(-1); //절대값
				
				if(disT < check) { //최소 거리 기록
					result[0] = i;
					result[1] = j;
				}
			}
		}System.out.println(result[0]+" "+result[1]);
		
	}

}
