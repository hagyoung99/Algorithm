package programmers;

public class JadenCase {
    public String solution(String s) {
        String answer = "";
        int num = s.length();
        answer += Character.toUpperCase(s.charAt(0));
        for(int i=1;i<num;i++){
            if(s.charAt(i-1)==' ') answer += Character.toUpperCase(s.charAt(i));
            else answer += Character.toLowerCase(s.charAt(i));
        }
        return answer;
    }
    
    public static void main(String[] args) {
        JadenCase main = new JadenCase();
        System.out.println(main.solution("3people unFollowed me"));
        System.out.println(main.solution("for the last week"));
    }
}
