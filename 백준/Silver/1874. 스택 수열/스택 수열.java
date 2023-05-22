import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		// 수열의 개수 입력
		int A[] = new int[N]; 		// 개수만큼 배열 생성
		for(int i=0; i < N; i++) { 	// 실제 데이터 입력 
			A[i] = sc.nextInt();
		}
		Stack<Integer>stack = new Stack<>(); // 스택
		int num = 1; 
		boolean result = true;
		StringBuffer bf = new StringBuffer();
		for(int i=0; i<A.length; i++) { 	// 수열에 있는 값들을 차례대로 가져오기
			int su = A[i]; 
			if(su >= num) { 				// 배열에 있는 값이 현재 오름차순 자연수보다 큰 경우
				while(su >= num) { 			// 같아질 때까지 반복
					stack.push(num++); 		// push 하기
					bf.append("+\n"); 		// + 로 찍어주기
				}
				stack.pop(); 				// pop 하기
				bf.append("-\n"); 			// - 로 찍어주기 
			} else { 						// 같지 않을 경우 
				int n = stack.pop(); 		// 빼내기
				if(n > su) { 				// 현재 수열에 있는 값이 스택의 마지막 값보다 크다
					System.out.println("NO"); // 종료
					result = false;
					break;
				} else {					// 두 값이 똑같을 때 
					bf.append("-\n"); 		// - 찍어주기
				}
			}
		}
		if(result) System.out.println(bf.toString());
	}

}
