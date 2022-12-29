package baekjoon.silver;

import java.util.*;

public class S5Q11866 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++) q.offer(i);

        StringBuilder answer = new StringBuilder();
        answer.append("<");
        while(q.size()>1){
            for(int i=0;i<k-1;i++) q.offer(q.poll());
            answer.append(q.poll()).append(", ");
        }
        answer.append(q.poll()).append(">");
        System.out.println(answer);
    }
}
