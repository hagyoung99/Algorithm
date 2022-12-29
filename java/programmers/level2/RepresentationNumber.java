package programmers.level2;

public class RepresentationNumber {
    public int solution(int n) {
        int answer = 0;
        int cnt = 1;
        while(n > 0){
            n -= cnt;
            if(n%cnt == 0) answer++;
            cnt++;

        }
        return answer;
    }

    public static void main(String[] args){
        RepresentationNumber main = new RepresentationNumber();
        System.out.println(main.solution(15));
    }
}
