package programmers;

import java.util.*;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        BestAlbum m = new BestAlbum();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        for(int x: m.solution(genres, plays)) System.out.print(x+" ");
    }
}
