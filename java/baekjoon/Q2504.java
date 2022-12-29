package baekjoon;

import java.util.*;

//백준 2504번 괄호의 값
public class Q2504 {
    /*
     1. 입력받은 문자열을 문자로 하나씩 반복한다.
     2. 여는 괄호가 들어오는 경우 스택에 저장한다.
     3. 닫는 괄호가 나오는 경우 스택의 마지막 값을 꺼내 확인한다.
     3-1. pop한 값이 숫자인 경우 
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        Stack<Character> s = new Stack<>(); 
        for(char x:str.toCharArray()){
            if(x=='('||x=='[') s.add(x);
            else {  //닫는괄호인경우
                if(s.empty()) {
                    System.out.println("0");
                    return;
                } else if(x==']'){ //대괄호일때
                    char c = s.pop();
                    if(Character.isDigit(c)){    //스택의 값을 pop했을 때 숫자인 경우
                        if(s.peek()=='['){ //숫자를 뺀 값을 확인한다. 해당 값이 여는 대괄호인 경우 
                            s.pop();
                            int add = Character.getNumericValue(c) * 3; //먼저 있던 숫자에 3을 곱하고
                            s.add(Character.forDigit((add), 10));  //큐에 넣어준다.
                        } else{
                            System.out.println("0");
                            return;
                        }
                    } else {    //스택의 값을 pop했을 때 괄호인 경우
                        if(c == '[') {  //대괄호인 경우
                            if(Character.isDigit(s.peek())){    //그 다음 값이 숫자인지 확인한다. 숫자인 경우 해당 값과 괄호의 값을 더해 add한다.
                                int add = Character.getNumericValue(s.pop()) + 3;
                                s.add(Character.forDigit((add), 10));
                            } else {
                                s.add('3');
                            }
                        }
                    }
                } else {
                    char c = s.pop();
                    if(Character.isDigit(c)){    //스택의 값을 pop했을 때 숫자인 경우
                        if(s.peek()=='('){ //숫자를 뺀 값을 확인한다. 해당 값이 여는 대괄호인 경우 
                            s.pop();
                            int add = Character.getNumericValue(c) * 2; //먼저 있던 숫자에 3을 곱하고
                            s.add(Character.forDigit((add), 10));  //큐에 넣어준다.
                        } else{
                            System.out.println("0");
                            return;
                        }
                    } else {    //스택의 값을 pop했을 때 괄호인 경우
                        if(c == '(') {  //대괄호인 경우
                            if(Character.isDigit(s.peek())){    //그 다음 값이 숫자인지 확인한다. 숫자인 경우 해당 값과 괄호의 값을 더해 add한다.
                                int add = Character.getNumericValue(s.pop()) + 2;
                                s.add(Character.forDigit((add), 10));
                            } else {
                                s.add('2');
                            }
                        }
                    }
                }
            }
        }
        
    }
}
/*
(()[[]])([])
(2[3]

 */