package DongGun.lab;

import java.io.IOException;
import java.util.Scanner;

public class Test00 {

	public static void main(String[] args) throws IOException {

		// # 5- 21
		final int SIZ = 5;
		int x = 0;
		int y = 0;
		int num = 0;

		int[][] bingo = new int[SIZ][SIZ];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < SIZ; i++)
			for (int j = 0; j < SIZ; j++)
				bingo[i][j] = i * SIZ + j + 1;

		for (int i = 0; i < SIZ; i++) {
			for (int j = 0; j < SIZ; j++) {
				x = (int) (Math.random() * SIZ);
				y = (int) (Math.random() * SIZ);

				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;

			} // for ed j
		} // for ed i
		do {
			for (int i = 0; i < SIZ; i++) {
				for (int j = 0; j < SIZ; j++)
					System.out.printf(" %2d \n", bingo[i][j]);
				System.out.println();
			}
			System.out.println();

			System.out.printf("1~ %d 의 숫자를 입력하세요. (종료 > 0", SIZ * SIZ);
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);

			// 입력 받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0 을 저장
			outer: for (int i = 0; i < SIZ; i++) {
				for (int j = 0; j < SIZ; j++) {
					if (bingo[i][j] == num) {
						bingo[i][j] = 0;
						break outer; // 2중 반복문을 벗어난다
					}
				}
			}
		} while (num != 0);

	}

}
