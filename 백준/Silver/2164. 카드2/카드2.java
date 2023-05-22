import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> myQueue = new LinkedList<>();
		int N = sc.nextInt();				// 카드 개수
		for(int i = 1; i <= N; i++) {
			myQueue.add(i);					// 1부터 차례대로 쌓기
		}
		
		while(myQueue.size()>1) {			// 큐의 사이즈가 1보다 클 때까지
			myQueue.poll();					// 맨위의 카드 버리기
			myQueue.add(myQueue.poll());	// 제일 아래에 넣어주기
		}
		System.out.println(myQueue.poll());	// 출력
	}
}