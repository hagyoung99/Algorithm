package baekjoon;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Q2164 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        /*
         1. N장의 카드를 큐에 순서대로 넣는다.
         2. 큐에서 카드가 하나 남을때까지 제거와 위치 옮기기를 반복한다.
         3. 큐에 마지막 남은 카드를 출력한다.
         */
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++) q.offer(i);

        while(q.size()>1){
            q.poll();
            q.offer(q.poll());
        }
        System.out.println(q.poll());
    }
}
