package programmers.level2;

public class FindTheNumber {
    public int solution(int n, int k) {
        String str = Integer.toString(n,k);
        System.out.println(str);
        int answer = -1;
        return answer;
    }
    public static void main(String[] args) {
        FindTheNumber main = new FindTheNumber();

        System.out.println(main.solution(437674, 3));
        System.out.println();
        System.out.println(main.solution(110011, 10));
    }
}
