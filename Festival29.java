
public class Festival29 {

	public static void main(String[] args) {
		// �Ʒ��� ���� 2���� �迭�� �������� 180�� ȸ���Ͽ� ���
		// 24�� (25��/40��)
		int arr[][] = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = 5 * i + j + 1;
			}
		}

		for (int i = 4; i >= 0; i--) {
			for (int j = 4; j >= 0; j--) {

				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");
		}

	}

}
