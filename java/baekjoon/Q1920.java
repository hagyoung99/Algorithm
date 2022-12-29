package baekjoon;

import java.util.*;

/*
 * 백준 1920번 수 찾기
 */
public class Q1920 {
    /*
     1. 입력된 배열 a를 정렬한다.
     2. 비교해야하는 숫자를 하나씩 꺼내는 반복문을 작성한다.
     3. 정렬된 a의 시작점과 끝점을 각각 lt, rt에 저장한다.
     4. lt가 rt보다 작거나 같은 동안에 lt와 rt의 중간 지점(mid)을 찾아 값을 비교한다.
     4-1. mid가 x와 같은경우 해당 숫자가 존재하는 것으로 결과값을 바꾼뒤 반복문을 종료한다.
     4-2. mid가 x보다 작은경우 mid 아래의 숫자들에는 x값이 존재하지 않는것으로 lt의 값을 mid+1로 변경한다.
     4-3. mid가 x보다 큰경우 mid 이상의 숫자들에는 x값이 존재하지 않는것으로 rt의 값을 mid-1로 변경한다.
     5. 4의 과정을 반복한다.
     6. 최종결과를 answer에 추가하고 비교해야할 배열이 종료되면 answer을 리턴한다.
     */
    public List<Integer> solution(int n, int[] a, int m, int[] arr){
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(a);

        for(int x:arr){
            int lt = 0;
            int rt = a.length-1;
            int check = 0;
            while(lt<=rt){
                int mid = (lt+rt)/2;
                if(a[mid] == x){
                    check = 1;
                }
                if(a[mid] < x) lt = mid+1;
                else rt = mid-1;
            }
            if(check == 1){
                answer.add(1);
            } else {
                answer.add(0);
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Q1920 main = new Q1920();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[m];
        for(int i=0;i<m;i++) arr[i] = in.nextInt();

        for(int x:main.solution(n , a, m, arr)) System.out.println(x);
        
    }
}
