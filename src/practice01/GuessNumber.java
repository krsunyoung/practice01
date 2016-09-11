package practice01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Random r = new Random();
		int guessNumber = r.nextInt(100) + 1;

		
		System.out.println(" 값을 결정했습니다. 입력해주세요");

		while (true) {

			int i = scan.nextInt();

			if (i > guessNumber) {

				System.out.println(" 더 작게 ");
			} else if (i < guessNumber) {
				System.out.println(" 더 높게 ");
			} else {
				System.out.println("정답입니다.");		
				System.out.println(" 계속 하시겠습니까 ? ");
				String answer = scan.next();
				if( answer.equals("y") ){
			   	continue;
				}else {
			 	break;
				}
			}

		}
		

		
		scan.close();
	}

	

}
