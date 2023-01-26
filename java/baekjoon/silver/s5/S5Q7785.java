package baekjoon.silver.s5;

import java.io.*;
import java.util.*;

public class S5Q7785 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> hash = new HashSet<>();
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String record = st.nextToken();
            if(record.equals("enter")) hash.add(name);
            else hash.remove(name);
        }
        List<String> list = new ArrayList<>(hash);
        Collections.sort(list, Collections.reverseOrder());
        for(String x:list) System.out.println(x);
    }
}
