package programmers;

import java.util.*;

public class CorrectParenthesis {
    
    public int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<progresses.length;i++){

            q.offer((int) (Math.ceil((100.0 - progresses[i]) / speeds[i])));
        }

        ArrayList<Integer> answer = new ArrayList<>();
        while(!q.isEmpty()){
            int x = q.poll();
            int upload = 1;
            while(!q.isEmpty() && x >= q.peek()){
                upload++;
                q.poll();
            }
            answer.add(upload);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args){
        CorrectParenthesis m = new CorrectParenthesis();
        int[] prog = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        int[] answer = {2, 1};

        for(int x: m.solution(prog, speeds)){
            System.out.println(x);
        }
    }
    

}
