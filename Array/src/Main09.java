import java.util.Arrays;
import java.util.Scanner;

public class Main09 {

    public int solution(int n,int[][] arr){
        int answer = 0;
        int sum1, sum2;
        //각 행과 열의 합
        for (int i = 0; i < n; i++) {
            sum1 = sum2 =0;
            for (int j = 0; j < n; j++) {
                sum1 +=arr[i][j];
                sum2 +=arr[j][i];
            }
            answer = Math.max(answer,sum1);
            answer = Math.max(answer,sum2);
        }
        //두 대각선의 합
        sum1 =sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1+=arr[i][i];
            sum2+=arr[i][(n-1)-i];

            answer = Math.max(answer,sum1);
            answer = Math.max(answer,sum2);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main09 T = new Main09();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 5
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n,arr));

    }
}

