package baekjoon;

import java.util.*;

public class Q3986 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];

        int answer = 0;
        for(int i=0;i<n;i++){
            arr[i] = in.next();
            
        }
        for(String str:arr){
            Stack<Character> s = new Stack<>();
            s.push(str.charAt(0));  //제일 앞 문자를 스택에 쌓는다.
            for(int i=1;i<str.length();i++){
                if(s.empty()) s.push(str.charAt(i));    //스택이 비어있는 경우 문자를  스택에 쌓는다.
                else {
                    if(str.charAt(i) == s.peek()) s.pop();  //스택이 비어있지 않으면서 비교문자와 같은경우 제거한다.
                    else s.push(str.charAt(i)); //비교문자와 다른경우 문자를 스택에 쌓는다.
                }
            }
            if(s.empty()) answer++; //스택이 비어있다면 좋은 단어로 카운트를 더한다. 
        }

        System.out.println(answer);
    }
}
