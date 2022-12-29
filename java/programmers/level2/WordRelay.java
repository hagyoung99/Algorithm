package programmers.level2;

import java.util.*;

public class WordRelay {
    public int[] solution(int n, String[] words) {
        HashSet<String> set = new HashSet<String>();
        char check = words[0].charAt(0);
        int num = 0, order = 0;


        for(int i=0;i<words.length;i++){
            if(check != words[i].charAt(0)){
                if(!set.contains(words[i])){
                    set.add(words[i]);
                    check = words[i].charAt(words[i].length()-1);
                } else {

                }
            }
        }


        int[] answer = {};

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다. 
        System.out.println("Hello Java");

        return answer;
    }
    public static void main(String[] args) {
        WordRelay main = new WordRelay();
        System.out.println(main.solution(3, 
            new String[] {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}));
        System.out.println();

        System.out.println(main.solution(5, 
            new String[] {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", 
            "establish", "hang", "gather", "refer", "reference", "estimate", "executive"}));
        System.out.println();

        System.out.println(main.solution(2, new String[] {"hello", "one", "even", "never", "now", "world", "draw"}));
        System.out.println();
    }
}
