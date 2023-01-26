package baekjoon.silver.s4;

import java.io.*;
import java.util.*;

public class S4Q17219 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, String> map = new HashMap<>();
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<m;i++){
            sb.append(map.get(br.readLine())).append('\n');
        }
        System.out.println(sb);
    }
}
