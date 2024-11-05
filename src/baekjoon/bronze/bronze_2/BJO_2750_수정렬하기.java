package baekjoon.bronze.bronze_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 문제 : 백준 2750번 - 수 정렬하기 (https://www.acmicpc.net/problem/2750)
 * 문제 풀이
 * -
 */
public class BJO_2750_수정렬하기 {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{

        int N = Integer.parseInt(bf.readLine());

        List<Integer> values = addValues(N);

        arraySorting(values);

        for (int i = 0; i < N; i++) {                     // O(N)
            System.out.println(values.get(i));
        }

    }

    private static List<Integer> addValues(int N) throws Exception{

        List<Integer> valueList = new ArrayList<>();

        for(int i = 0; i < N; i++)                              // O(N)
            valueList.add(Integer.parseInt(bf.readLine()));

        return valueList;

    }

    private static void arraySorting(List<Integer> values) {
        Collections.sort(values);
    }

}