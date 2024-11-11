package programmers.level_2;

public class PSG_12949_행렬의곱셈 {

    public static void main(String[] args) {

        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        solution(arr1, arr2);
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] answer = new int[arr1.length][arr2[0].length];

        int var = 0;

        int i, j, k;

        for (i = 0; i < arr1.length; i++) {
            for (j = 0; j < arr2[0].length; j++) {
                for (k = 0; k < arr1[0].length; k++) {
                    var += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = var;
                var = 0;
            }
        }

        return answer;
    }

}