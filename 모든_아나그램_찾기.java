package algolism;

import java.util.*;

public class Main {
	public int Solution(String first, String second) {

		int count = 0;
		// second 작업
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : second.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		// 투포인터 first 작업
		HashMap<Character, Integer> map1 = new HashMap<>();
		for (int i = 0; i < second.length()-1; i++) {
			map1.put(first.charAt(i), map1.getOrDefault(first.charAt(i), 0) + 1);
		}
		int index = 0;
		for (int rt = second.length() - 1; rt < first.length(); rt++) {
			map1.put(first.charAt(rt), map1.getOrDefault(first.charAt(rt), 0) + 1);
			if (map.equals(map1)) {
				count += 1;
			}
			map1.put(first.charAt(index), map1.get(first.charAt(index)) - 1);
			if (map1.get(first.charAt(index)) == 0) {
				map1.remove(first.charAt(index));
			}
			index += 1;
		}

		return count;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);

		String first = sc.next();
		String second = sc.next();

		System.out.println(T.Solution(first, second));
	}
}