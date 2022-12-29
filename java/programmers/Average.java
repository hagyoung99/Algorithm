package programmers;

public class Average {
    public double solution(int[] arr) {

        int sum = 0;
        for(int x:arr) sum += x;
        double answer = (double)sum/arr.length;

        return answer;
    }

    public static void main(String[] args) {
        Average main = new Average();
        int[] arr = {1,2,3,4};
        System.out.println(main.solution(arr));

        int[] arr2 = {5,5};
        System.out.println(main.solution(arr2));
    }
    
}
