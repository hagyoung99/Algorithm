package programmers;

public class MaxMin {
    public String solution(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(String x:s.split(" ")){
            int n = Integer.parseInt(x);
            if( n> max) max = n;
            if(n < min) min = n;
        }
        String answer = String.valueOf(min)+" "+String.valueOf(max);
        return answer;
    }

    public static void main(String[] args) {
        MaxMin m = new MaxMin();
        System.out.println(m.solution("1 2 3 4"));
        System.out.println(m.solution("-1 -2 -3 -4"));
        System.out.println(m.solution("-1 -1"));
    }
}
