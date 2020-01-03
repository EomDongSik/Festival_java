import java.util.Random;

public class Festival11 {

	public static void main(String[] args) {
		// 8칸 크기의 배열을 선언하고 랜덤수로 초기화 한 후 가장 큰 수와 작은 수를 각각 출력
		Random rd = new Random();
		int[] array = new int[8];
		
		System.out.print("배열에 있는 모든 값 >> ");
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
		System.out.println("가장 큰 값>> "+array[7]);
		System.out.println("가장 작은 값>> "+array[0]);
	}

}
