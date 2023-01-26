package baekjoon.silver;

import java.util.*;
import java.io.*;

public class S5Q1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> hs = new HashSet<>();
        List<String> answer = new ArrayList<>();
        for(int i=0;i<N;i++) hs.add(br.readLine());
        for(int i=0;i<M;i++){
            String Ms = br.readLine();
            if(hs.contains(Ms)) answer.add(Ms);
        }
        Collections.sort(answer);
        System.out.println(answer.size());
        for(String x:answer) System.out.println(x);

    }
}
