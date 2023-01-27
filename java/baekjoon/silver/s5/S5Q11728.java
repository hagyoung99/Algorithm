package baekjoon.silver.s5;

import java.io.*;
import java.util.*;
public class S5Q11728 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Long[] A = new Long[N];
        Long[] B = new Long[M];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) A[i] = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++) B[i] = Long.parseLong(st.nextToken());

        Arrays.sort(A);
        Arrays.sort(B);
        
        StringBuilder sb = new StringBuilder();
        int i=0,j=0;
        while(i<A.length && j<B.length){
            if(A[i] == B[j]){
                sb.append(A[i++]).append(" ");
            } else if(A[i] > B[j]){
                sb.append(B[j++]).append(" ");
            } else {
                sb.append(A[i++]).append(" ");
            }
        }
        while(i<A.length) sb.append(A[i++]).append(" ");
        while(j<B.length) sb.append(B[j++]).append(" ");

        System.out.print(sb);
    }
}
