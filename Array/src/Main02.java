import java.util.*;

public class Main02 {

    public int solution(int n,int[] arr){
        int max = arr[0];
        int answer = 1;
        // 이중 for문이 아닌 max를 사용해보자 !!!
        for (int i = 0; i < n; i++) {
            if (arr[i]>max){
                max = arr[i];
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main02 T = new Main02();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n]; // 130 135 148 140 145 150 150 153
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n,arr));

    }
}