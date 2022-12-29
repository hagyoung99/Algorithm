package programmers;

import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

public class Printer {
    public int solution(int[] priorities, int location) {
        int answer = 1; //출력 순서를 담는다.

        Queue<order> q = new LinkedList<>();
        for(int i=0;i<priorities.length;i++){
            q.offer(new order(i, priorities[i]));   //order 객체 생성 후 순서, 중요도 순으로 데이터 입력
        }
        while(!q.isEmpty()){
            order x = q.poll(); //기준 값 제외
            for(order y:q){ //기준값을 제외한 나머지를 하나씩 반복하면서 비교
                if(y.id > x.id){  //중요도를 비교해 기준 값보다 큰 값이 있을 경우
                    q.offer(x); //기준 값을 맨 뒤로 보낸다.
                    x=null;     //기준값을 제거한다.
                    break;
                }
            }
            if(x!=null){    //기준값이 남아있다면 해당 값이 가장 중요도가 높은 값으로
                if(x.order == location) return answer; //순서가 같다면 return
                else answer++;  //순서가 다르다면 +1해주면서 location의 출력 순서를 찾는다.
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Printer main = new Printer();
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        System.out.println(main.solution(priorities, location));
    }
    
}

class order{
    int order;  //처음입력된 순번 저장
    int id;     //중요도 저장

    order(int order, int id){
        this.order = order;
        this.id = id;
    }
}
