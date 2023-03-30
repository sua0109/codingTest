import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException{
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
      StringTokenizer st;
      
      int T = Integer.parseInt(br.readLine());
      
      for(int i = 0; i < T; i++) {
         
         st = new StringTokenizer(br.readLine(), " ");
         int A = Integer.parseInt(st.nextToken());
         int B = Integer.parseInt(st.nextToken());
         
         bw.write( A + B + "\n");
      
      }
      
      bw.flush();
      br.close();
      bw.close();

   }

}