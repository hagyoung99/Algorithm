package baekjoon;

import java.util.*;

public class Q10799 {
    /*
     1. 입력받은 문자열을 문자로 쪼개 반복한다.
     2. 문자가 여는 괄호일경우 스택에 추가한다.
     3. 문자가 닫는 괄호인경우
     3-1. 인덱스로 바로 전 문자를 조회했을때 여는 괄호인 경우 레이저
          - 레이저의 시작인 괄호를 제거한다.
          - 스택의 사이즈만큼 조각을 더한다.
     3-2. 인덱스로 바로 전 문자를 조회했을때 닫는 괄호인 경우 막대가 끝난것
          - 끝난 막대의 괄호를 제거한다.
          - 하나의 막대가 끝난것이기 때문에 조각개수를 하나 더한다.
    4. 최종 조각 수를 출력한다.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        
        int answer = 0; //
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char x = str.charAt(i);
            if(x == '(') s.add(x);
            else {
                if(str.charAt(i-1) == '('){
                    s.pop();
                    answer += s.size();
                } else {
                    s.pop();
                    answer += 1;
                }
            }
        }

        System.out.println(answer);
    }
}
