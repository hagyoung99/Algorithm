package baekjoon.silver.s5;

import java.io.*;
import java.util.*;
public class S5Q18511 {
    static int answer = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<K;i++) arr[i] = Integer.parseInt(st.nextToken());

        DFS(0, N, arr);
        System.out.println(answer);
    }

    public static void DFS(int sum, int N, int[] arr){
        if(sum > N) return;
        answer = Math.max(answer, sum);

        for(int i=0;i<arr.length;i++){
            DFS(sum*10+arr[i], N, arr);
        }
    }
}
