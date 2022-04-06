import java.util.*;

public class Least_Recently_Used {
	public int[] Solution(int n, int[] arr) {

		int[] answer = new int[n];
		for (int x : arr) {
			int pos = -1;
			for (int i = 0; i < n; i++) {
				if (answer[i] == x)
					pos = i;
			}
			if (pos == -1) {
				for (int i = n - 1; i >= 1; i--) {
					answer[i] = answer[i - 1];
				}
			} else {
				for (int i = pos; i >= 1; i--) {
					answer[i] = answer[i - 1];
				}
			}
			answer[0] = x;
		}
		return answer;
	}

	public static void main(String[] args) {
		Least_Recently_Used T = new Least_Recently_Used();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[m];
		for (int i = 0; i < m; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i : T.Solution(n, arr)) {
			System.out.print(i + " ");
		}

	}
}