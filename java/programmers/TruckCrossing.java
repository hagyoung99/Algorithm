package programmers;

import java.util.Queue;
import java.util.LinkedList;

public class TruckCrossing {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        /*
        while문으로 계속 반복하면서 1초씩 더한다.
        트럭을 다리위에 올릴 수 있다면(무게와 길이 여유가 있다면)
            트럭위에 있는 모든 차들의 시간을 +1을 더하고,
            트럭을 하나 올린다. offer(무게, 1)
        트럭을 다리위에 올릴 수 없다면(무게나 길이의 여유가 없다면)
            트럭위에 올릴 수 있을 때까지 모든 차들의 시간을 +1하고
            time도 그만큼씩 더한다.
            그리고 올릴 수 있게 되면 트럭을 하나 올린다.
         */

        int sum = 0;    //다리 무게 합
        Queue<truck> q = new LinkedList<>();
        // Queue<Integer> tr = new LinkedList<>();
        // for(int x:truck_weights) tr.offer(x);
        // System.out.println(tr.size());

        for(int i=0;i<truck_weights.length;i++){
            int t = truck_weights[i];
            if(sum+t > weight || q.size()+1 > bridge_length){   //트럭이 들어갈 수 없는 경우
                while(true){    //다리에 트럭을 올릴 수 있게 될때까지 반복한다.
                    answer++;   //1초 추가
                    for(truck x:q) x.time += 1; //트럭을 한칸씩 옮긴다.
                    if(q.peek().time > bridge_length) sum-=q.poll().weight;
                    if(sum+t <= weight && q.size()+1 <= bridge_length) {
                        q.offer(new truck(t, 1));
                        sum += t;
                        break;
                    }
                }
            } else {
                //System.out.println("트럭 들어갈 수 있음 ["+t+"]");
                for(truck x:q) x.time += 1; //다리위 트럭을 한칸씩 움직인다.
                if(!q.isEmpty() && q.peek().time > bridge_length) sum -= q.poll().weight;   //다리를 지난 트럭이 있다면 무게를 빼준다.
                q.offer(new truck(t, 1));   //다리에 트럭을 올린다.
                sum += t;   //트럭의 무게를 추가한다.
                answer++;   //1초를 추가한다.
                
            }
        }

        // while(!tr.isEmpty()){
        //     int t = tr.peek();  //들어가야하는 트럭의 무게
            
        // }

        while(!q.isEmpty()){
            answer++;
            for(truck x:q) x.time += 1;
            if(q.peek().time >= bridge_length) {
                q.poll();
            }
        }
        if(q.isEmpty()) answer++;
        return answer;
    }
    
    class truck{
        int weight;
        int time;

        truck(int weight, int time){
            this.weight=weight;
            this.time = time;
        }
    }

    public static void main(String[] args){
        TruckCrossing main = new TruckCrossing();

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        int answer = main.solution(2, 10, new int[] {7,4,5,6});
        System.out.println("answer1 : "+answer);
        
        // int bridge_length2 = 100;
        // int weight2 = 100;
        // int[] truck_weights2 = {10};
        // System.out.println("-----------------------------");
        // System.out.println("answer2 : "+(main.solution(bridge_length2, weight2, truck_weights2)));

        
        // int bridge_length3 = 100;
        // int weight3 = 100;
        // int[] truck_weights3 = {10,10,10,10,10,10,10,10,10,10};
        // System.out.println("-----------------------------");
        // System.out.println("answer3 : "+(main.solution(bridge_length3, weight3, truck_weights3)));

        // bridge_length3 = 4;
        // weight3 = 2;
        // int[] truck_weights4 = {1,1,1,1};
        // System.out.println("-----------------------------");
        // System.out.println("answer3 : "+main.solution(bridge_length3, weight3, truck_weights4));
    }
}
