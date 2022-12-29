package programmers.level2;

public class FindDecimal {
    public int solution(int n, int k) {
        String a = Integer.toString(n,k);
        String[] aa = a.split("0");
        int answer = 0;

        for(String x:aa) {
            if(!x.equals("1") && !x.equals("")) if(check(Integer.parseInt(x))) answer++;
        }

        return answer;
    }

    public boolean check(int x){
        for(int i=2;i<x;i++){
            if(x%i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        FindDecimal main = new FindDecimal();
        // System.out.println(main.solution(437674, 3));
        System.out.println(main.solution(110011, 10));
    }
}
