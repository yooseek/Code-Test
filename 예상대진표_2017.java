package algolism;
class Solution{
    public int solution(int n, int a, int b){
        int count =0;
		while(true) {
			if(a%2!=0) {
				a = a+1;
			}
			if(b%2!=0) {
				b = b+1;
			}
			if(a==b) {
				break;
			}
			a = a/2;
			b = b/2;
			count += 1;
		}
        
        return count +1;
    }
}