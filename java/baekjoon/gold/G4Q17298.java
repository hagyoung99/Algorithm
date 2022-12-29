package baekjoon.gold;

import java.io.*;
import java.util.*;

public class G4Q17298 {
    public static void main(String[] args) throws IOException {
        G4Q17298 main = new G4Q17298();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = Integer.parseInt(st.nextToken());
    }
}
