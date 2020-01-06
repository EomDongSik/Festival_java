
public class Festival31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(caesar("a B z", 30));
	}

	public static String caesar(String st, int cnt) {
		char[] str = st.toCharArray();
		String caesarSt = "";
	
		for (int i = 0; i < str.length; i++) {
			int result = (int) str[i];
			if (str[i] == ' ') {
				caesarSt += str[i];
			}
			// if(result >= (int)'A' && result <= (int)'Z')

			if (result >= 65 && result <= 90) {
				int change = (int) str[i] + cnt;
				int count = change - 90;
				while (true) {
					if (change >= 91) {
						str[i] = (char) ((64 + count));
					} else {
						str[i] = (char) ((int) str[i] + cnt);
					}
					if (count < 26) {
						caesarSt += str[i];
						break;
					}else {
						count = count - 26;
					}
				}
			}

			if (result >= 97 && result <= 122) {
				int change = (int) str[i] + cnt;
				int count = change - 122;
				while (true) {
					if (change >= 123) {
						str[i] = (char) ((96 + count));
					} else {
						str[i] = (char) ((int) str[i] + cnt);
					}
					if (count < 26) {
						caesarSt += str[i];
						break;
					}else {
						count = count - 26;
					}
				}
			}
		}
		return caesarSt;
	}

}
