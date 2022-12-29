package baekjoon.silver;

import java.util.*;
import java.io.*;

public class S1Q15565 {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(str.nextToken());
        int k = Integer.parseInt(str.nextToken());
        str = new StringTokenizer(in.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = Integer.parseInt(str.nextToken());

        int lt=-1, rt=-1;
        int cnt = 0;
        int answer = -1;
        while(lt<rt){
            if(cnt>=k) {
                System.out.println(rt +" : "+lt);
                answer = rt-lt;
            }
            if(cnt >= k || rt==n-1){
                lt++;
                if(arr[lt]==1) cnt--;
            } else {
                rt++;
                if(arr[rt]==1) cnt++;
            }
        }
        System.out.println(answer);
    }
}
