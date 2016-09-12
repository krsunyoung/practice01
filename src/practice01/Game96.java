package practice01;

public class Game96 {
	public static void main(String[] args) {

		for (int i = 1; i <= 99; i++) {
			String s = String.valueOf(i);

			int ClapCount = 0;

			int j = s.length();

			for (int z = 0; z < j; z++) {
				char c = s.charAt(z);
				if (c == '3' || c == '6' || c == '9') {
					ClapCount++;

				}
				

			}
			
			System.out.print(i);
			for (int z = 0; z < ClapCount; z++) {

				System.out.print("짝");
			}

			System.out.println("");

		}

	}
}
