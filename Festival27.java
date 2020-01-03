import java.util.Arrays;

public class Festival27 {

	public static void main(String[] args) {
		// 합병
		int A [] = {1,3,5,7,9,11,13,15,17,19};
		int B [] = {2,4,6,8,10,12,14,16,18,20};
		int Merge[] = mergeArray(A, B);
		
		System.out.println(Arrays.toString(Merge));
		
	}
	public static int[] mergeArray(int a[], int b[]) {
		
		int m[] = new int[a.length+b.length];
		int cnt = 0; //값을 집어넣기 위해서
		
		//값을 다 넣어 준다
		for (int temp : a) {
			m[cnt] = temp;
			cnt++;		
		}
		for (int temp : b) {
			m[cnt] = temp;
			cnt++;		
		}
		//선택 정렬
		for(int i=0; i<m.length-1; i++) {
			
			int index = i;
			for(int j=i+1; j<m.length; j++) {
				if(m[index]>m[j]) {
					index = j;
				}
			}
			int temp = m[index];
			m[index] = m[i];
			m[i] = temp;
		}
		
		return m;
	}

}
