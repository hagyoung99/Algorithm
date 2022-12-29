package baekjoon.gold;

import java.util.*;
import java.io.*;

// 틀림
public class G5Q2470 {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int[] arr = new int[n];
        StringTokenizer str = new StringTokenizer(in.readLine());
        for(int i=0;i<n;i++) arr[i] = Integer.parseInt(str.nextToken());
        Arrays.sort(arr);

        int lt=0, rt=n-1;
        int gap = Integer.MAX_VALUE;
        int sum=0;
		int ans1 = 0;
		int ans2 = 0;
        while(lt<rt){
            sum = arr[lt]+arr[rt];
            if(Math.abs(sum) < gap) {
                gap = Math.abs(sum);
				ans1 = arr[lt];
				ans2 = arr[rt];
            }
            if(0 >= sum) lt++;
            else rt--;
        }
		System.out.println(ans1 + " " + ans2);
    }
}