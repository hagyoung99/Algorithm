package programmers;

public class BinaryTransformation {
    public int[] solution(String s) {
        /*
         1. 문자열이 1이 될때까지 반복할 반복문을 작성한다.
         2. 반복문이 한번 돌때마다 이진변환 횟수에 +1을 해준다.
         3. tmp에 s에서 0이 제거된 문자열을 입력한다.
         4. s.length - tmp.lenght 로 제거된 0의 개수를 answer[1]에 더한다.
         5. tmp의 길이를 구해 이진수로 변환한다.
         6. 2~5까지의 과정을 s가 0이 될때까지 반복한다.

         - 기준문자열.replaceAll(”문자열A”, “문자열B”)
            - 기준문자열에 [문자열A]를 모두 [문자열B]로 변경
        - Integer.toBinaryString([10진수]);
            - 10진수를 2진수로 변경해준다. (String 타입으로 리턴된다.)
         */
        int[] answer = new int[2];  //[0]은 이진변환 횟수 / [1]은 제거된 0의 개수
        while(!s.equals("1")){
            answer[0]++;
            String tmp = s.replaceAll("0", "");
            answer[1] += s.length()-tmp.length();

            s = Integer.toBinaryString(tmp.length());   
        }
        return answer;
    }

    public static void main(String[] args) {
        BinaryTransformation main = new BinaryTransformation();
        for(int x:main.solution("110010101001")) System.out.print(x+" ");
        System.out.println();
        for(int x:main.solution("01110")) System.out.print(x+" ");
        System.out.println();
        for(int x:main.solution("1111111")) System.out.print(x+" ");
        System.out.println();
    }
}
