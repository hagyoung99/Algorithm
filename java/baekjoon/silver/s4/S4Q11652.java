package baekjoon.silver;

import java.util.*;
import java.io.*;

public class S4Q11652 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Long, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            Long number = Long.parseLong(br.readLine());
            map.put(number, map.getOrDefault(number,0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(int value:map.values()){
            max = Math.max(max, value);
        }

        List<Long> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for(Long key:list){
            if(map.get(key) == max){
                System.out.println(key);
                break;
            }
        }
    }
}
