package programmers.level_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
 * 문제 : 프로그래머스 68644번 - 수 정렬하기 (https://school.programmers.co.kr/learn/courses/30/lessons/68644)
 * 문제 풀이
 * -
 */
public class PGS_68644_두개뽑아서더하기 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{

        int[] numbers = {2,1,3,4,1};

        solution(numbers);

    }

    public static int[] solution(int[] numbers) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {      // O(N^2)
            for(int j = 1 + i; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        List<Integer> arrayLists = new ArrayList<>(set);

        Collections.sort(arrayLists);

        int[] result = new int[arrayLists.size()];

        for(int i = 0; i < result.length; i++) {  // O(N)
            result[i] = arrayLists.get(i);
        }

        return result;

    }

}