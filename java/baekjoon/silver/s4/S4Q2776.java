package baekjoon.silver;

import java.io.*;
import java.util.*;

public class S4Q2776 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        while(T-- > 0){
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            HashSet<Integer> set = new HashSet<>();
            for(int i=0;i<N;i++) set.add(Integer.parseInt(st.nextToken()));
            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<M;i++) {
                if(set.contains(Integer.parseInt(st.nextToken()))) sb.append('1').append('\n');
                else sb.append('0').append('\n');
            }
        }
        System.out.println(sb);
    }
}
