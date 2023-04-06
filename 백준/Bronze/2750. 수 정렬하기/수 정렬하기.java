import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int n = Integer.parseInt(br.readLine()); // 수의 개수
		for(int i=0; i <n; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		
		// System.out.print("변경 전: " + arr);
		arr.sort(null); // 배열 오름차순 정렬
		// System.out.print("변경 후: " + arr);
		
		int m = arr.size();
		for(int i=0; i<m; i++) { //0부터 저장...?
			sb.append(arr.get(i)+ "\n");
		}
		
		// 출력할 땐 sb.toString()
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}

}