
public class Festival25 {

	public static void main(String[] args) {
		// �Ʒ��� ���� 1������ ������ �־����� ��, �� �� ���� �Ÿ��� ª�� ��(index)���� ���
		// (��, ���� ������ �Ÿ��� ��� �ٸ���)
		// 21�� (20��/35��)
		int[] point = {92, 32, 52, 9, 81, 2, 68};
		int[] result = {0,1};
		int check = 0;
		
		
		for(int i = 0; i<point.length-1; i++) {
			
			check = point[result[0]] - point[result[1]]; //������ ���ϱ�
			check = check>=0?check:check*(-1);
			for(int j = i+1; j<point.length; j++) {
				
				int disT = point[i]-point[j];
				disT = disT>=0?disT:disT*(-1); //���밪
				
				if(disT < check) { //�ּ� �Ÿ� ���
					result[0] = i;
					result[1] = j;
				}
			}
		}System.out.println(result[0]+" "+result[1]);
		
	}

}
