package programmers;

import java.util.*;

public class KNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0;i<commands.length;i++){
            int[] cm = commands[i];
            int[] arr = Arrays.copyOfRange(array, cm[0]-1, cm[1]);
            Arrays.sort(arr);

            answer[i] = arr[cm[2]-1];
        }
        return answer;
    }

    public static void main(String[] args) {

        KNumber main = new KNumber();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4,4,1}, {1,7,3}};
        
        for(int x:main.solution(array, commands)){
            System.out.println(x);
        }
    }
}
