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

    /*
    문제 설명
    정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

    제한사항
    numbers의 길이는 2 이상 100 이하입니다.
    numbers의 모든 수는 0 이상 100 이하입니다.

    numbers	result
    [2,1,3,4,1]	[2,3,4,5,6,7]
    [5,0,2,7]	[2,5,7,9,12]

    */

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