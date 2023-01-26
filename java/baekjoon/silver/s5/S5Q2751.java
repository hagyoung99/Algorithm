package baekjoon.silver.s5;

import java.io.*;
import java.util.*;

public class S5Q2751 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) arr.add(Integer.parseInt(br.readLine()));
        Collections.sort(arr);

        int[] a = {1,2,3,5,4};
        Arrays.sort(args);

        StringBuilder sb = new StringBuilder();

        for(int v : arr) sb.append(v).append('\n');

        System.out.println(sb);
    }
}
