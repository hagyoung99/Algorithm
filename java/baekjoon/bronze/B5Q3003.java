package baekjoon.bronze;

import java.util.Scanner;

public class B5Q3003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] chess = {1,1,2,2,2,8};
        int[] cnt = new int[6];
        for(int i=0;i<6;i++) cnt[i] = chess[i] - in.nextInt();
        for(int x:cnt) System.out.print(x+" ");
    }
}
