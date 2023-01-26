package baekjoon.silver.s4;

import java.io.*;
import java.util.*;
public class S4Q1158 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        for(int i = 1;i<=N;i++) q.offer(i); //1부터 N까지 큐에 값을 넣는다.

        StringBuilder sb = new StringBuilder();
        sb.append('<');
        while(q.size() > 1){    //큐에 사이즈가 하나 남을때까지 반복한다.(출력문을 만들기 위해 하나 남기고 반복)
            int cnt = 1;//순서를 기록
            while(cnt++<K){ //k번째가 되기 전까지 큐에서 값을 꺼내 다시 넣는걸 반복한다.
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", "); //k번째가 되면 큐에서 값을 하나 꺼낸다.
        }
        sb.append(q.poll()).append(">");
        System.out.println(sb);
    }
}
