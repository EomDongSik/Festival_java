import java.util.Random;

public class Festival11 {

	public static void main(String[] args) {
		// 8ĭ ũ���� �迭�� �����ϰ� �������� �ʱ�ȭ �� �� ���� ū ���� ���� ���� ���� ���
		Random rd = new Random();
		int[] array = new int[8];
		
		System.out.print("�迭�� �ִ� ��� �� >> ");
		for(int i =0; i<array.length; i++) {
			
			array[i] = rd.nextInt(90)+10;
			System.out.print(array[i]+" ");
		}
		System.out.println("");
		
		for(int i=1; i<array.length; i++) {
			
			int temp = 0;
			if(array[i-1]-array[i]>0) {
				temp = array[i];
				array[i] = array[i-1];
				array[i-1] = temp;
			}
		}
		for(int i=array.length-2; i>=0; i--) {
			
			int temp = 0;
			if(array[i+1]-array[i]<0) {
				temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
			}
		}
		System.out.println("���� ū ��>> "+array[7]);
		System.out.println("���� ���� ��>> "+array[0]);
	}

}
