package baekjoon.silver;

import java.util.*;
import java.io.*;

public class S4Q1620{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        String[] names = new String[n+1];
        for(int i = 1; i < n + 1; i++) {
			String name = br.readLine();
			map.put(name, i);
            names[i] = name;
		}

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++){
            String str = br.readLine();
            if(isNumeric(str)) sb.append(names[Integer.parseInt(str)]).append("\n");
            else sb.append(map.get(str)).append("\n");
        }
        System.out.println(sb);
    }

    public static boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}