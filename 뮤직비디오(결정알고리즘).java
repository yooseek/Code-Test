package algolism;

import java.util.*;

public class Main {
	public int Solution(int n,int[] arr) {
		
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		int answer = 0;
		// ÀÌºĞÅ½»ö
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(check(mid,arr,n)) {
				rt = mid-1;
				answer = mid;
			}else {
				lt = mid + 1;
			}
		}
		return answer;
	}
	public boolean check(int mid,int[] arr,int n) {
		int sum =0;
		int count = 1;
		for(int i : arr) {
			if(sum+i > mid) {
				count +=1;
				sum = i;
			}else {
				sum += i;
			}
			
		}
		if(count > n) {
			return false;
		}
		return true;
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
