package algolism;

import java.util.*;

public class Main {
	public int Solution(int n,int[] arr) {
		
		Arrays.sort(arr);
		int lt = 1;
		int rt = Arrays.stream(arr).max().getAsInt();
		int answer = 0;
		// ÀÌºÐÅ½»ö
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(check(mid,arr,n)) {
				lt = mid+1;
				answer = mid;
			}else {
				rt = mid - 1;
			}
		}
		return answer;
	}
	public boolean check(int mid,int[] arr,int n) {
		int sum =0;
		int count = 1;
		for(int i=1;i<arr.length;i++) {
			sum += arr[i]-arr[i-1];
			if(sum >=mid) {
				count +=1;
				sum = 0;
			}
		}		
		if(count >= n) {
			return true;
		}
		return false;
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