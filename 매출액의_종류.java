package algolism;

import java.util.*;

public class Main {
	public List<Integer> Solution(int r, int[] num) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		
		int index =0;
		for(int i=0; i<r;i++) {
			map.put(num[i],map.getOrDefault(num[i],0)+1);
		}
		list.add(map.size());
		while(index +r -1 <num.length-1) {
			map.put(num[index],map.get(num[index])-1);
			if(map.get(num[index])==0) {
				map.remove(num[index]);
			}
			map.put(num[index+r],map.getOrDefault(num[index+r],0)+1);
			list.add(map.size());
			index += 1;
		}
		return list;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int[] num = new int[n];
		for(int i=0; i<n; i++) {
			num[i] = sc.nextInt();
		}
		for(int i : T.Solution(r, num)) {
			System.out.print(i+" ");
		}
	}
}