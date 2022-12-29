package baekjoon;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Q1158 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        String answer = "";

        Queue<Integer> q = new LinkedList<>();
        for(int i = 1;i<=n;i++) q.offer(i); //큐에 번호를 1번부터 k까지 넣는다.

        answer+= "<";
        while(q.size()>1){  //큐가 하나 남을때까지 반복한다.
            for(int i=0;i<k-1;i++) q.offer(q.poll());   //k전까지는 다시 뒤로 보낸다.
            answer += q.poll()+", ";
        }
        answer += q.poll()+">";
        System.out.println(answer);
    }
}
