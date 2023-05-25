import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new LinkedList<Integer>();
		
		for(int i = 0 ; i < num ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int push = 0;
			
			switch(st.nextToken()) {
			
			case "push_front":			
				// push_front X: 정수 X를 덱의 앞에 넣는다.
				push = Integer.parseInt(st.nextToken());
				deque.addFirst(push);
				break;
				
			case "push_back":			
				// push_back X: 정수 X를 덱의 뒤에 넣는다.
				push = Integer.parseInt(st.nextToken());
				deque.addLast(push);
				break;
				
			case "pop_front":			
				/*
				 pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 
				 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				*/
				if(!deque.isEmpty()) {
					System.out.println(deque.pollFirst());
				} else {
					System.out.println("-1");
				}
				break;
			
			case "pop_back":			
				/*
				 pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 
		 		 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				*/
				if(!deque.isEmpty()) {
					System.out.println(deque.pollLast());
				} else {
					System.out.println("-1");
				}
				break;
			
			case "size":				
				// size: 덱에 들어있는 정수의 개수를 출력한다.
				System.out.println(deque.size());
				break;
			
			case "empty":				
				// empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
				
				if(deque.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
				break;
			
			case "front":			
				/* 
				 front: 덱의 가장 앞에 있는 정수를 출력한다. 
				 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				*/
				if(!deque.isEmpty()) {
					System.out.println(deque.getFirst());
				} else {
					System.out.println("-1");
				}
				break;
			
			case "back":			
				/* 
				 back: 덱의 가장 뒤에 있는 정수를 출력한다. 
				 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				*/
				if(!deque.isEmpty()) {
					System.out.println(deque.getLast());
				} else {
					System.out.println("-1");
				}
				break;
			}
		}
	}
}