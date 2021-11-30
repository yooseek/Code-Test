package algolism;

import java.util.*;

public class Main {
	public int Solution(int n,int[] arr) {
		
		Arrays.sort(arr);
		
		int mid = 0;
		int lt=0;
		int rt= arr.length-1;
		while(arr[mid]!=n) {
			mid = (lt+rt)/2;
			if(arr[mid]<n) {
				lt = mid+1;
			}else if(arr[mid] > n){
				rt = mid-1;
			}
		}	
		return mid+1;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.Solution(m, arr));
	}
}
