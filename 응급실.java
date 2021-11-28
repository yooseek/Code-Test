package algolism;

import java.util.*;

public class Main {
	public int Solution(int n,int m,Queue<Person> que) {
		
		int count = 0;
		
		while(true) {
			boolean check = true;
			for(Person p : que) {
				if(p.getDanger() > que.peek().getDanger()) {
					que.add(que.poll());
					check =false;
					break;
				}
			}
			if(check) {
				if(que.peek().getId() == m) {
					count +=1;
					return count;
				}else {
					que.poll();
					count +=1;
				}
			}
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Queue<Person> queue = new LinkedList();
		for(int i=0; i<n;i++) {
			queue.add(new Person(i,sc.nextInt()));
		}
		System.out.println(T.Solution(n,m,queue));
	}
}
class Person {
	int id;
	int danger;
	public Person(int id,int danger) {
		this.id =id;
		this.danger = danger;
	}
	public int getId() {
		return id;
	}
	public int getDanger() {
		return danger;
	}

}