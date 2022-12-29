package programmers.level1;

import java.util.*;

public class NewIdSuggestion {
    public String solution(String new_id) {
        String answer = "";

        //1단계
        new_id = new_id.toLowerCase();  

        //2단계
        new_id = new_id.replaceAll("[^0-6a-z-_.]","");

        //3단계
        answer = Character.toString(new_id.charAt(0));
        for(int i=1;i<new_id.length();i++){
            if(new_id.charAt(i)!= '.') answer += Character.toString(new_id.charAt(i));
            else {
                if(new_id.charAt(i-1)!='.') answer += Character.toString(new_id.charAt(i));
            }
        }
        new_id = answer;

        //4단계
        if(new_id.charAt(0)=='.') new_id = new_id.substring(1, new_id.length());
        if(new_id.length()>1){
            if(new_id.charAt(new_id.length()-1)=='.') new_id = new_id.substring(0, new_id.length()-1);
        }

        //5단계
        if(new_id.equals("")) new_id = "a";

        //6단계
        if(new_id.length()>=16) new_id = new_id.substring(0, 15);
        if(new_id.charAt(0)=='.') new_id = new_id.substring(1, new_id.length());
        if(new_id.length()>1){
            if(new_id.charAt(new_id.length()-1)=='.') new_id = new_id.substring(0, new_id.length()-1);
        }

        //7단계
        if(new_id.length()<=2){
            while(new_id.length()<3) new_id+=new_id.charAt(new_id.length()-1);
        }
        return new_id;
    }

    public static void main(String[] args) {
        NewIdSuggestion main = new NewIdSuggestion();

        // System.out.println(main.solution("...!@BaT#*..y.abcdefghijklm"));
        // System.out.println();
        // System.out.println(main.solution("z-+.^."));
        // System.out.println();
        // System.out.println(main.solution("=.="));
        // System.out.println();
        // System.out.println(main.solution("123_.def"));
        System.out.println();
        System.out.println(main.solution("abcdefghijklmn.p"));
    }
}
