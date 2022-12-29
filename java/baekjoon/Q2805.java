package baekjoon;

import java.util.*;

public class Q2805 {
    public int solution(int n, int m, int[] tree){
        int answer = 0;

        int lt = 1;
        int rt = Arrays.stream(tree).sum(); 

        while(lt<=rt){
            
        }

        
        return answer;
    }
    public static void main(String[] args) {
        Q2805 main = new Q2805();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] tree = new int[n];
        for(int i=0;i<n;i++) tree[i] = in.nextInt();

        System.out.println(main.solution(4,7, new int[] {20, 15, 10, 17}));
    }
}
