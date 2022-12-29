package programmers;

import java.util.*;

public class Camouflage {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        for(String[] x: clothes){
            map.put(x[1], map.getOrDefault(x[1], 0)+1); //headgear:2 eyewear:1
        }
        /*
        경우의 수는 map의 모든 키의 value의 값을 각각 곱한 값이다.
        하지만 한종류의 옷만 입는 경우가 있기 때문에 value에 +1을 해준다.

        */
        for(String key: map.keySet()){
            answer *= (map.get(key)+1);
        }
        //최종 경우의 수에는 모든 옷을 안입는 경우가 포함되어있기 때문에 그 경우를 제외하기 위해 -1을하고 리턴한다.
        return answer-1;
    }

    public static void main(String[] args) {
        Camouflage m = new Camouflage();
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(m.solution(clothes));
        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(m.solution(clothes2));

    }
}
