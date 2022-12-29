package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.ArrayList;

public class Q4949 {
    /*
     - main에서 문자열 하나가 입력될때마다 solution을 실행한다.
     1. 문자열에서 문자 하나하나를 비교할 수 있는 반복문을 작성한다.
     2. 여는 괄호가 나오는 경우 stack에 해당 괄호를 넣는다.
     3. 닫는 괄호가 나오는 경우
     3-1. 스택이 비어있는 경우 괄호가 짝을 이루지 못한것이기 때문에 no를 리턴한다.
     3-2. 스택이 비어있지 않은 경우 먼저 나오는 값을 확인해 비교중인 괄호와 짝이 되지 않는다면
          no를 리턴한다.
     4. 위의 조건에 걸리지 않고 2번의 반복문이 다 종료됐을 때 스택이 비어있지 않다면 
        짝을 이루지 못한 괄호가 남은것으로 no를 리턴하고 비어있다면 짝이 맞는것으로 yes를 리턴한다.
     */
    public String solution(String s){
        Stack<Character> stack = new Stack<>();
        for(char y : s.toCharArray()){
            if(y == '(' || y=='[') {
                stack.push(y);
            } else if(y == ')' || y==']'){
                if(stack.empty()){
                    return "no";
                } else {
                    if(y==']') if(stack.peek() != '[') return "no";
                               else stack.pop();
                    else if(y==')')  if(stack.peek() != '(') return "no";
                                     else stack.pop();
                }
            }
        }
        if(!stack.empty()) return "no";
        else return "yes";
    }
    public static void main(String[] args) throws IOException{
        Q4949 main = new Q4949();
        ArrayList<String> str = new ArrayList<>();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String s = in.readLine();
            if(s.equals(".")) break;
            str.add(main.solution(s));
        }

        for(String x:str) System.out.println(x);
    }
}
