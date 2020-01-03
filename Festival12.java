
public class Festival12 {

	public static void main(String[] args) {
		// 학생들의 성적정보가 문자열로 선언되어 있을 때 각 성적 별 학생 수 출력
		String score = "A,A,B,C,D,A,,C,D,D,D,F";
		String scores[] = {"A", "B", "C", "D", "F"};
		int i = 0;
		int cnt[] = new int[5];
		
		String grade[]= score.split(","); // ,로 잘라서 배열에 넣는다
		
		for(String temp : scores) {
			for(String temp2 : grade) {
				if(temp.equals(temp2)) {//있는지 확인
					cnt[i]++;
				}
			}i++;
			
		}
		for(int j=0; j<scores.length; j++) {
			System.out.println(scores[j]+" : "+cnt[j]+"명");
			
		}
		
				
						
				
	}

}
