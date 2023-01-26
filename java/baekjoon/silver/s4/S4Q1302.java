package baekjoon.silver.s4;

import java.io.*;
import java.util.*;

public class S4Q1302 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String book = br.readLine();
            map.put(book, map.getOrDefault(book, 0)+1);
        }

        int max = Integer.MIN_VALUE;
        for(String key:map.keySet()) max = Math.max(max, map.get(key));

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for(String key:list){
            if(max == map.get(key)){
                System.out.println(key);
                break;
            }
        }
    }
}
