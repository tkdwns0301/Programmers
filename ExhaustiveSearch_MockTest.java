package ExhaustiveSearch;

import java.util.*;

public class ExhaustiveSearch_MockTest {
	public int[] solution(int[] answers) {
		int[] answer = {};

		int[][] arr = new int[3][10000];

		for (int i = 0; i < 10000; i++) {
			arr[0][i] = (i % 5) + 1;

			if (i % 2 == 0) {
				arr[1][i] = 2;
			} else {
				if (i % 8 == 1)
					arr[1][i] = 1;
				if (i % 8 == 3)
					arr[1][i] = 3;
				if (i % 8 == 5)
					arr[1][i] = 4;
				if (i % 8 == 7)
					arr[1][i] = 5;
			}

			switch (i % 10) {
			case 0:
				arr[2][i] = 3;
				arr[2][i + 1] = 3;
				break;
			case 2:
				arr[2][i] = 1;
				arr[2][i + 1] = 1;
				break;
			case 4:
				arr[2][i] = 2;
				arr[2][i + 1] = 2;
				break;
			case 6:
				arr[2][i] = 4;
				arr[2][i + 1] = 4;
				break;
			case 8:
				arr[2][i] = 5;
				arr[2][i + 1] = 5;
				break;
			}
		}

		int max = 0;
		int[] cnt = new int[3];
		Vector<Integer> v = new Vector<Integer>();

		for (int i = 0; i < 3; i++) {
			cnt[i] = 0;

			for (int j = 0; j < answers.length; j++) {
				if (arr[i][j] == answers[j]) {
					cnt[i] = cnt[i] + 1;
				}
			}

			if (max <= cnt[i]) {
				max = cnt[i];
			}
		}

		for (int i = 0; i < 3; i++) {
			if (cnt[i] >= max) {
				v.add(i);
			}
		}

		answer = new int[v.size()];

		for (int i = 0; i < v.size(); i++) {
			answer[i] = v.get(i) + 1;
		}

		return answer;
	}
}
