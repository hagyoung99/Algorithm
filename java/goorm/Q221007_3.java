package goorm;

import java.io.*;
import java.util.*;

public class Q221007_3 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer input = new StringTokenizer(br.readLine());
		int[] arr = new int[4];
		for(int i=0;i<4;i++) arr[i] = Integer.parseInt(input.nextToken());
		Arrays.sort(arr);
		int answer = (arr[0]-arr[2])+(arr[1]-arr[3]);
		System.out.println(Math.abs(answer));
	}
}
