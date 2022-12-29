package baekjoon.silver;

import java.util.*;
import java.io.*;

public class S3Q2559 {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(str.nextToken());
        int k = Integer.parseInt(str.nextToken());
        str = new StringTokenizer(in.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = Integer.parseInt(str.nextToken());

        int max = Integer.MIN_VALUE;
		for (int i = 0; i < n + 1 - k; i++) {	// K 개씩 묶어서 모두 더한 뒤 최댓값 구하기
			int sum = 0;
			for (int j = i; j < i + k; j++) {
				sum += arr[j];
			}
			max = Math.max(max, sum);
		}

        // int lt = 0, rt=0, sum=0;
        // int max = Integer.MIN_VALUE;
        // while(rt < k) {
        //     sum += arr[rt++];
        // }
        // while(rt < n){
        //     sum = sum +arr[rt++]-arr[lt++];
        //     max = Math.max(max, sum);
        // }
        // max = Math.max(max, sum);
        System.out.println(max);

    }
}
