package baekjoon.silver;

import java.io.*;
import java.util.*;

public class S3Q9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] answer = new int[n];
        for(int i=0;i<n;i++){
            int m = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            int cnt = 1;
            for(int j=0;j<m;j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String kind = st.nextToken();
                map.put(kind, map.getOrDefault(kind,0)+1);
            }
            for(String key: map.keySet()){
                cnt *= (map.get(key)+1);
            }
            answer[i] = cnt-1;
        }
        for(int x:answer) System.out.println(x);
    }
}
