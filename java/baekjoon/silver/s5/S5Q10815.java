package baekjoon.silver;

import java.io.*;
import java.util.*;

public class S5Q10815 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<n;i++) set.add(Integer.parseInt(st.nextToken()));
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++) {
            if(set.contains(Integer.parseInt(st.nextToken()))) System.out.print("1 ");
            else  System.out.print("0 ");
        }
    }
}
