package programmers;
import java.util.Map;
import java.util.HashMap;

public class NotComplete {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for(String x:participant){  //참여 인원을 이름별로 저장
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for(String x:completion){   //완주자 인원을 참여인원에서 한명씩 제외
            int cnt = map.get(x) -1;
            map.put(x, cnt);
        }
        for(String key:map.keySet()){   //전체 인원을 돌면서
            if(map.get(key)!=0) {   //0이 아닌 인원이 있는경우 완주하지 못한사람으로 리턴시킨다.
                answer = key;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        NotComplete m = new NotComplete();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(m.solution(participant, completion));

        
        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(m.solution(participant2, completion2));

        
        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "ana", "mislav"};
        System.out.println(m.solution(participant3, completion3));
    }
}
