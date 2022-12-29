package programmers;

import java.util.*;

public class Truck {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int sum = 0;  //다리에 올라간 트럭들의 전체 무게
        int answer = 0;  //경과 시간

        Queue<truck> q = new LinkedList<>();

        for(int i=0;i<truck_weights.length;i++){
            int t = truck_weights[i];   //트럭을 하나씩 빼서 다리를 지나갈 수 있는지 없는지 확인한다.
            while(sum+t > weight || q.size()+1 > bridge_length){  
                //다리가 다 차거나, 무게가 초과될 경우 추가할 수 있을 때까지 q에서 트럭을 제거한다.
                truck out = q.poll();
                answer += out.time;
                sum -= out.weight;
            }

            if(q.isEmpty()) q.offer(new truck(t, bridge_length));
            else q.offer(new truck(t, 1));
            sum += t;
        }
            
        while(!q.isEmpty()){
            answer += q.poll().time;
        }
        return answer+1;
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
        Truck main = new Truck();
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        System.out.println("-----------------------------");
        System.out.println("answer1 : "+(main.solution(bridge_length, weight, truck_weights)==8));
        

        
        int bridge_length2 = 100;
        int weight2 = 100;
        int[] truck_weights2 = {10};
        System.out.println("-----------------------------");
        System.out.println("answer2 : "+(main.solution(bridge_length2, weight2, truck_weights2)==101));

        
        int bridge_length3 = 100;
        int weight3 = 100;
        int[] truck_weights3 = {10,10,10,10,10,10,10,10,10,10};
        System.out.println("-----------------------------");
        System.out.println("answer3 : "+(main.solution(bridge_length3, weight3, truck_weights3)==110));

        bridge_length3 = 4;
        weight3 = 2;
        int[] truck_weights4 = {1,1,1,1};
        System.out.println("-----------------------------");
        System.out.println("answer3 : "+main.solution(bridge_length3, weight3, truck_weights4));
    }

    
}
