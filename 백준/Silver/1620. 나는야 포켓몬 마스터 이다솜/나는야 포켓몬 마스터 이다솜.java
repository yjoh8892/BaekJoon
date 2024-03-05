import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String,String> hashMap = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            String poke = br.readLine();
            String num = Integer.toString(i + 1);

            hashMap.put(poke, num);
            hashMap.put(num, poke);
        }
        
        for (int i = 0; i < M; i++) {
            sb.append(hashMap.get(br.readLine())).append('\n');
        }
        System.out.println(sb);
    }
}