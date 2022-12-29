package baekjoon;

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Q25305 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        Integer[] score = new Integer[n];
        for(int i=0;i<n;i++) score[i]=in.nextInt();

        Arrays.sort(score, Collections.reverseOrder());
        System.out.println(score[k-1]);
    }
}
