package baekjoon.silver.s4;

import java.io.*;
import java.util.*;
public class S4Q2164 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();  //큐 생성
        for(int i =1;i<=N;i++) q.offer(i);      //1부터 N까지의 수를 큐에 넣는다.

        while(q.size()>1){  //큐의 사이즈가 1이 될때까지 반복한다.
            q.poll();           //제일 앞의 값을 제거하고
            q.offer(q.poll());  //그 다음 값을 뒤로 보낸다
        }
        System.out.println(q.poll());   //하나남은 큐의 값을 출력한다.
    }
}
