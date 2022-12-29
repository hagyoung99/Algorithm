package programmers;

public class LeastRecentlyUsed {
    /*
    예외 : cacheSize가 0인경우 모든 데이터가 cache miss가 되기 때문에 입력 입력된 배열의 lenght*5를 리턴한다.
     1. 지정된 크기만큼의 배열 cache를 생성한다.
     2. 입력된 도시이름을 하나씩 반복한다.
     3. cache 내에 도시이름이 있는 경우 cache miss로 miss 변수에 해당 문자열의 인덱스를 넣어준다.
     4. miss가 0보다 큰경우 cache miss이기 때문에 실행시간에 5를 더해주고, cache의 데이터를 하나씩 뒤로 밀어낸다.(마지막 데이터는 제거된다.)
     4-1. miss가 0 이상인 경우 cache hit기 때문에 실행시간에 1을 더해주고, miss의 인덱스까지 저장된 인덱스를 하나씩 뒤로 밀어낸다.
     5. cache[0]에 도시이름을 추가한다.
     6. cities의 배열이 끝날때까지 3에서 5까지 반복한다.
     7. 실행시간을 리턴한다.
     */
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        if(cacheSize == 0) return (cities.length)*5;
            

        String[] cache = new String[cacheSize];
        for(String s:cities){
            s = s.toUpperCase();
            int miss = -1;
            for(int i=0;i<cacheSize;i++) {
                if(s.equals(cache[i])) miss = i;
            }
            if(miss < 0){
                answer += 5;
                for(int i=cacheSize-1;i>0;i--) cache[i] = cache[i-1];
            } else {
                answer += 1;
                for(int i=miss;i>0;i--) cache[i] = cache[i-1];
            }
            cache[0] = s;
        }
        return answer;
    }

    public static void main(String[] args) {
        LeastRecentlyUsed main = new LeastRecentlyUsed();
        System.out.println(main.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
        System.out.println(main.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}));
        System.out.println(main.solution(2, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
        System.out.println(main.solution(5, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
        System.out.println(main.solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"}));
        System.out.println(main.solution(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }
}
