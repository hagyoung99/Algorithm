package baekjoon.silver.s5;

import java.util.*;
import java.io.*;

public class S5Q2003 {
    public int solution(int m, int[] arr){
        int answer = 0;

        int lt=0, rt = 0;
        int sum = 0;
        while(lt < arr.length){
            if(sum > m || rt == arr.length) sum -= arr[lt++];
            else sum += arr[rt++];

            if(sum == m) answer++;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException{
        S5Q2003 main = new S5Q2003();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = in.nextInt();

        System.out.println(main.solution(m, arr));
    }
}
