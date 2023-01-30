package baekjoon.silver.s1;

import java.io.*;
import java.util.*;
public class S1Q2504 {
    public static void main(String[] args) throws IOException{
        String str = new BufferedReader(new InputStreamReader(System.in)).readLine();

        Stack<Character> s = new Stack<>();

        int value = 1;
        int answer = 0;
        for(int i=0;i<str.length();i++){
            char x = str.charAt(i);
            if(x=='('){
                s.add(x);
                value *= 2;
            } else if(x=='['){
                s.add(x);
                value *= 3;
            }
            else if(x==')'){
                if(s.empty() || s.peek()!='('){
                    System.out.println("0");
                    return;
                }
                if(str.charAt(i-1)=='(') answer += value;
                s.pop();
                value /= 2;
            } else {
                if(s.empty() || s.peek()!='['){
                    System.out.println("0");
                    return;
                }
                if(str.charAt(i-1)=='[') answer += value;
                s.pop();
                value /= 3;
            }
        }
        if(!s.empty()){
            System.out.println("0");
            return;
        }
        System.out.println(answer);
    }
}
