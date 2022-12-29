package baekjoon.silver;

import java.io.*;
import java.util.*;

public class S5Q1427 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        List<Integer> list = new ArrayList<>();
        for(char x:st.toCharArray()) list.add(Character.getNumericValue(x));
        Collections.sort(list, Comparator.reverseOrder());
        for(int x:list) System.out.print(x);

        
    }
}
