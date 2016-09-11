package practice01;

public class Game963 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 99; i++) {

			String s = String.valueOf(i);

			int ClapCount1 = 0;
			int ClapCount = 0;
			char c = s.charAt(0);
			int j = s.length();
			
			
			if (s.length() == 1) {

				if (c == '3' || c == '6' || c == '9') {
					ClapCount++;
				}

			} else {

				char d = s.charAt(1);
				if (c == '3' || c == '6' || c == '9') {
					if (d == '3' || d == '6' || d == '9') {
						ClapCount++;
					}

					ClapCount1++;
				}

			}
			
			int result = ClapCount + ClapCount1;
			System.out.print(i + " ");
			
			for (int z = 0; z < result; z++) {

				System.out.print("짝");
			}
			System.out.println("");
		}

	}
}
