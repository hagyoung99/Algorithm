package programmers.level2;

import java.util.*;

public class MinimumRectangle {
    public int solution(int[][] sizes) {
        int answer = 0;
        int xMax = 0, yMax=0;
        for(int[] x:sizes){
            Arrays.sort(x);
            if(x[0] > xMax) xMax = x[0];
            if(x[1] > yMax) yMax = x[1];
        }
        answer = xMax * yMax;
        return answer;
    }

    public static void main(String[] args) {
        MinimumRectangle main = new MinimumRectangle();
        System.out.println(main.solution(new int[][] {{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
        System.out.println(main.solution(new int[][] {{10,7}, {12,3}, {8,15}, {15,7},{5,15}}));
        System.out.println(main.solution(new int[][] {{14,4},{19,6},{6,16},{18,7},{7,11}}));
    }
}
