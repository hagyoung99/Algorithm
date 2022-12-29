package programmers;

import java.util.HashSet;

public class Pokemon {
    public int solution(int[] nums) {
        /*
        N마리의 포켓몬이 각각 다르다면 가질 수 있는 포켓몬 종류의 최대 값은 N/2다.
        하지만 N마리의 포켓몬이 중복된다면 가질 수 있는 포켓몬 종류는 중복된 수에 따라 달라진다.
        1. 중복을 제거하기 위해 hashSet에 값을 넣어준다.
        2. hashset의 사이즈가 N/2과 비교한다.
        3. hashSet의 사이즈가 n/2보다 작다면 중복된 포켓몬 종류를 제외하고 hashSet의 종류만큼만 가질 수 있고
        4. hashSet의 사이즈가 n/2보다 크다면 가질 수 있는 포켓몬의 종류는 N/2만큼이다.
         */
        HashSet<Integer> h = new HashSet<Integer>();
        for(int x:nums){    
             h.add(x);
        }
        if(nums.length/2 < h.size()) return nums.length/2;
        else return h.size();
    }
    

    public static void main(String[] args) {
        Pokemon m = new Pokemon();
        int[] arr = {3,1,2,3};
        System.out.print(m.solution(arr));
        
        int[] arr2 = {3,3,3,2,2,4};
        System.out.print(m.solution(arr2));

        int[] arr3 = {3,3,3,2,2,2};
        System.out.print(m.solution(arr3));
    }
}
