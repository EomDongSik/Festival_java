import java.util.Arrays;

public class Festival27 {

	public static void main(String[] args) {
		// �պ�
		int A [] = {1,3,5,7,9,11,13,15,17,19};
		int B [] = {2,4,6,8,10,12,14,16,18,20};
		int Merge[] = mergeArray(A, B);
		
		System.out.println(Arrays.toString(Merge));
		
	}
	public static int[] mergeArray(int a[], int b[]) {
		
		int m[] = new int[a.length+b.length];
		int cnt = 0; //���� ����ֱ� ���ؼ�
		
		//���� �� �־� �ش�
		for (int temp : a) {
			m[cnt] = temp;
			cnt++;		
		}
		for (int temp : b) {
			m[cnt] = temp;
			cnt++;		
		}
		//���� ����
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
