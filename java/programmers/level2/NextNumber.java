package programmers.level2;

public class NextNumber {
    /*
     * Integer.bitCount()를 사용해 이진수 중 1의 수를 카운트한다.
     */
    public int solution(int n) {
        int answer = n;
        while(true) if(Integer.bitCount(n) == Integer.bitCount(++answer)) break;
        return answer;
    }

    public static void main(String[] args) {
        NextNumber main = new NextNumber();
        System.out.println(main.solution(78));
        System.out.println(main.solution(15));
    }
}
