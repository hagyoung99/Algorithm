package programmers;

import java.util.Queue;
import java.util.LinkedList;

public class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> q = new LinkedList<>();
        for(int x: prices) q.offer(x);  //큐에 배열 저장
        for(int i=0;i<prices.length;i++){   //배열 크기만큼 반복
            int x = q.poll();               //제일 처음 값을 가져온다.
            int cnt = 0;    //시간을 저장한다.
            for(int y:q){   //큐의 값을 조회하면서
                if(y>=x) cnt++; //값이 떨어지지 않았다면 시간을 더해주고
                else {  //값이 떨어졌다면 유지됐을 1초만 더해주고 반복문을 멈춘다.
                    cnt++;
                    break;
                };
            }
            answer[i]=cnt;
        }
        return answer;
    }

    public static void main(String[] args){
        StockPrice m = new StockPrice();
        int[] prices = {1, 2, 3, 2, 3};
        for(int x:m.solution(prices)){
            System.out.println(x);
        }
    }
}
