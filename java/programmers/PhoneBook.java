package programmers;

public class PhoneBook {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        for(String x:phone_book){
            for(int i=0;i<x.length();i++){
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        PhoneBook m = new PhoneBook();
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(m.solution(phone_book));
        
        String[] phone_book2 = {"123","456","789"};
        System.out.println(m.solution(phone_book2));
        
        String[] phone_book3 = {"12","123","1235","567","88"};
        System.out.println(m.solution(phone_book3));

    }
    
}
