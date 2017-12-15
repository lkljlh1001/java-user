package DongGun.lab;

public class Lap09 {
	public static void main(String[] args) {

		// # 5-6

		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		int max = score[0]; // 배열의 첫번째 값으로 최대값을 초기화
		int min = score[0]; // 배열의 첫번째 값으로 최소값을 초기화

		for (int i = 1; i < score.length; ++i) {
			if (score[i] > max) {
				max = score[i];

			} else if (score[i] < min) {
				min = score[i];
			}
		} // ed of for

		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);

		// # 5-10

		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i] = (int) (Math.random() * 10));

		}
		System.out.println();

		for (int i = 0; i < numArr.length - 1; i++) {
			boolean changed = false; // 자리바꿈이 발생했는지를 체크

			for (int j = 0; j < numArr.length - 1 - i; j++) {
				if (numArr[j] > numArr[j + 1]) {

					int temp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = temp;
					changed = true;
				} // ed if
			} // end j for
			if (!changed)
				break;

			for (int k = 0; k < numArr.length; k++)
				System.out.print(numArr[k]);

			System.out.println();

		} // end i for

		System.out.println("=========================================");

		// // # 5-11
		// numArr = new int[10];
		// int[] counter = new int[10];
		//
		// for (int i = 0; i < numArr.length; i++) {
		// numArr[i] = (int) (Math.random() * 10); // 10개의 임의 숫자
		// System.out.print(numArr[i]);
		// } // ed i for
		//
		// System.out.println();
		//
		// for (int i = 0; i < numArr.length; i++) {
		// counter[numArr[i]]++;
		// } // ed i for
		//
		// for (int i = 0; i < numArr.length; i++) {
		// System.out.println(i + "의개수 :" + counter[i]);
		// } // ed i for
		//
		// // # 5-20
		//
		// final int SIZE = 10;
		// int x = 0, y = 0;
		//
		// char[][] board = new char[SIZE][SIZE];
		// byte[][] shipBoard = {
		// // 1 2 3 4 5 6 7 8 9
		// { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 1
		// { 1, 1, 1, 1, 0, 0, 1, 0, 0 }, // 2
		// { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 3
		// { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 4
		// { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 5
		// { 1, 1, 0, 1, 0, 0, 0, 0, 0 }, // 6
		// { 0, 0, 0, 1, 0, 0, 1, 0, 0 }, // 7
		// { 0, 0, 0, 1, 0, 0, 1, 0, 0 }, // 8
		// { 0, 0, 0, 0, 0, 1, 1, 1, 0 },// 9
		// };
		//
		// // 1행에 행번호를 , 1열에 열번호를 저장
		// for (int i = 1; i < SIZE; i++)
		// board[0][i] = board[i][0] = (char) (i + '0');
		//
		// Scanner scanner = new Scanner(System.in);
		//
		// while (true) {
		// System.out.println("좌표를 입력하여라 (종료는 00)>");
		// String input = scanner.nextLine();
		// if (input.length() == 2) {
		// x = input.charAt(0) - '0';
		// y = input.charAt(1) - '0';
		// if (x == 0 && y == 0)
		// break;
		// }
		//
		// if (input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) {
		// System.out.println("잘못입력 하였습니다 . 다시입력해라");
		//
		// continue;
		// }
		//
		// board[x][y] = shipBoard[x - 1][y - 1] == 1 ? 'O' : 'X';
		// for (int i = 0; i < SIZE; i++)
		// System.out.println(board[i]);
		// System.out.println();
		//
		// }
		// // # 5- 21
		// final int SIZ = 5;
		// x = 0;
		// y = 0;
		// int num = 0;
		//
		// int[][] bingo = new int[SIZ][SIZ];
		// for (int i = 0; i < SIZ; i++) {
		// for (int j = 0; j < SIZ; j++)
		// bingo[i][j] = i * SIZ + j + 1;
		// }
		// for (int i = 0; i < SIZ; i++)
		// for (int j = 0; j < SIZ; j++)
		// x = (int) (Math.random() * SIZ);
		// y = (int) (Math.random() * SIZ);
		//
		// int tmp = bingo[i][j];
		// }
		// }
	} // ed of main

	// 교재 소스 5-6 , 5-10 , 5-11 , 5- 20 , 5-21
}// ed of class
