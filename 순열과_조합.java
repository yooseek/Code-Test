package programus;
import java.util.*;
public class 순열과_조합 {
	
	static boolean[] check;
	static Set<String> set;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] relation = {{"100","ryan","music","2"},
				{"200","apeach","math","2"},
				{"300","tube","computer","3"},
				{"400","con","computer","4"},
				{"500","muzi","music","3"},
				{"600","apeach","music","2"}};
		check = new boolean[relation[0].length];
		set = new HashSet<>();
		String[] strList = new String[relation[0].length];
		
		for(int i=1 ; i<= relation[0].length;i++) {
			combination2(0,4,i,check,relation[0]); 			//조합
			perm(0,4,i,check,relation[0],strList);			//순열
		}
		
	}
	// 조합
	public static void combination2(int index, int n, int r ,boolean[] visited2, String[] relation2) {
		if(r == 0) {
			StringBuilder sb = new StringBuilder();
			for(int i =0; i<visited2.length; i++) {
				if(check[i]) {
					sb.append(relation2[i]);
				}
			}
			set.add(sb.toString());
		}
		if(index == n) {
			return;
		}
		
		visited2[index] = true;
		combination2(index +1, n, r-1, visited2,relation2);
		visited2[index] = false;
		combination2(index +1, n, r, visited2,relation2);
	}
	//순열
	public static void perm(int index, int n, int r ,boolean[] visited2, String[] relation2, String[] output) {
		if(index == r) {
			for(int i=0; i<output.length;i++) {
				if(output[i] != null) {
					System.out.print(output[i]);
				}
			}
			System.out.println();
		}
		for(int i =0; i<n ; i++) {
			if(visited2[i] != true) {
				visited2[i] = true;
				output[index] = relation2[i];
				perm(index+1, n, r, visited2, relation2,output);
				output[index] = null;
				visited2[i] = false;
			}
		}
	}
}
