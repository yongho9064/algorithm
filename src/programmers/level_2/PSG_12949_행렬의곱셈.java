package programmers.level_2;

public class PSG_12949_행렬의곱셈 {

    public static void main(String[] args) {

        int[][] arr1 = {{1, 4}};
        int[][] arr2 = {{3, 3, 3}, {3, 3, 3}};

        solution(arr1, arr2);
    }
    
    /*
       나는 스파이더맨이다.
     */
    
    /*
        열과 행이 똑같아야 한다.
     */

    /*
     [1,4]

     행과 열을 곱해야된다.
     [3,3]                [0][0]  [0][1]
     [3,3]                [1][0]  [1][1]
     */
    public static int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {                       // 3
            for (int j = 0; j < arr1[i].length; j++) {                // 2
                for (int k = 0; k < arr2.length; k++) {               // 2
                    System.out.println(answer[i][k]);
                }
            }
        }

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }

        return null;
    }

}