package goorm;

import java.io.*;
import java.util.*;

public class Q221007_2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer input = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(input.nextToken());
		String s = input.nextToken();
		String[] arr = new String[n];
		int answer = 0;
		for(int i=0;i<n;i++) {
			String a = br.readLine();
			String tmp = a.replace(s,"");
			if(a.length() != tmp.length()) answer++;
		}
		
		
		System.out.println(answer);
	}
}
