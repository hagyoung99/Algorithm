package programmers;

import java.util.Map;
import java.util.*;

public class Tuple {

    public int[] solution(String s) {
        // 입력 예시 {{20,111},{111}}
        s = s.substring(2, s.length()-2);   //입력값에서 맨 앞과 맨 뒤의 중괄호를 제거한다. s = "20,111},{111"
        String[] arr = s.split("},\\{");         // },{ 를 기준으로 배열에 입력한다. 20,111   111 형식으로 저장된다.
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0;i<arr.length;i++){                  //하나의 집합 단위로 for문을 실행한다.
            String[] strArr = arr[i].split(","); //한 집합의 내용물을 , 단위로 잘라 원소로 만들고 strArr 배열에 저장한다.

            for(String x:strArr){                           //원소별로 for문을 실행
                int y = Integer.parseInt(x);                //return 값이 int형이기 때문에 문자열인 원소의 값을 정수형으로 변경한다.
                if(m.containsKey(y)) m.put(y, m.get(y)+1);  //해당 원소가 map에 있을 경우 해당 원소의 value 값을 +1 해준다.
                else m.put(y, 1);                    //해당 원소가 map에 없을 경우 해당 원소를 추가하면서 value값을 1로 초기화한다.
            }
        }
        //위의 과정이 완료되면 map에는 (20, 1)(111, 2) 형식의 데이터가 저장된다.

        List<Integer> listKeySet = new ArrayList<>(m.keySet());     //map에 저장되어있는 key를 리스트에 넣고
        Collections.sort(listKeySet, (key, value) -> (m.get(value).compareTo(m.get(key)))); //key가 가진 value값으로 내림차순 정렬한다.

        int[] answer = new int[m.size()];
        int cnt = 0;
        for(int key : listKeySet) {
            answer[cnt++] = key; //리턴될 객체에 값을 넣어준다.
        }

        return answer;
    }

    
    public static void main(String[] agrs) {
        Tuple main = new Tuple();
        String test = "";
        int[] answer = {};

        test = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        answer = main.solution(test);
        System.out.print("[");
        for(int i=0;i<answer.length;i++){
            if(i==answer.length-1) System.out.print(answer[i]);
            else System.out.print(answer[i]+", ");
        }
        System.out.println("]");

        test = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        answer = main.solution(test);
        System.out.print("[");
        for(int i=0;i<answer.length;i++){
            if(i==answer.length-1) System.out.print(answer[i]);
            else System.out.print(answer[i]+", ");
        }
        System.out.println("]");

        test = "{{20,111},{111}}";
        answer = main.solution(test);
        System.out.print("[");
        for(int i=0;i<answer.length;i++){
            if(i==answer.length-1) System.out.print(answer[i]);
            else System.out.print(answer[i]+", ");
        }
        System.out.println("]");

        test = "{{123}}";
        answer = main.solution(test);
        System.out.print("[");
        for(int i=0;i<answer.length;i++){
            if(i==answer.length-1) System.out.print(answer[i]);
            else System.out.print(answer[i]+", ");
        }
        System.out.println("]");

        test = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
        answer = main.solution(test);
        System.out.print("[");
        for(int i=0;i<answer.length;i++){
            if(i==answer.length-1) System.out.print(answer[i]);
            else System.out.print(answer[i]+", ");
        }
        System.out.println("]");
    }
}
