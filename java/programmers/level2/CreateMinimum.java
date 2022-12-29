package programmers.level2;

import java.util.*;

public class CreateMinimum {
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<A.length;i++) answer += A[i] * B[B.length-i-1];
        return answer;
    }

    public static void main(String[] args){
        CreateMinimum main = new CreateMinimum();
        System.out.println(main.solution(new int[] {1,4,2}, new int[] {5,4,4}));
        System.out.println(main.solution(new int[] {1,2}, new int[] {3,4}));
    }
}
