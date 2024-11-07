package programmers.level_1;

import java.util.ArrayList;
import java.util.List;

public class PGS_42840_모의고사 {

    public static void main(String[] args) {

        int[] answers = {1,2,3,4,5,1,1,2,2};

        solution(answers);
    }

    public static int[] solution(int[] answers) {

        int[] m1 = {1, 2, 3, 4, 5};
        int[] m2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] m3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        List<Integer> scores = new ArrayList<>();

        scores.add(totalScore(m1, answers));
        scores.add(totalScore(m2, answers));
        scores.add(totalScore(m3, answers));

        int[] answer = verification(scores);

        return answer;
    }

    public static int totalScore(int[] members, int[] answers) {

        int score = 0;              // 점수
        int x = 0;                  // answers가 수포자의 문제를 벗어났을 경우 0으로 다시 초기화 시키기 위해

        for(int i = 0; i < answers.length; i++) {
            if (members.length == x) {
                x = 0;
            }
            if(members[x] == answers[x]) {
                score++;
            }

            System.out.print(members[x] + " ");
            x++;
        }

        System.out.println();

        return score;
    }

    public static int[] verification (List<Integer> scores) {

        int max = scores.get(0);
        List<Integer> arrays = new ArrayList<>();

        for(int i = 0; i < scores.size(); i++) {

            if(scores.get(i) == 0) {
                continue;
            }

            if (max == scores.get(i)) {
                arrays.add(i + 1);
            }

            if (max < scores.get(i)) {
                arrays.clear();
                arrays.add(i + 1);
                max = scores.get(i);
            }

        }

        int[] answer = arrays.stream().sorted().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}