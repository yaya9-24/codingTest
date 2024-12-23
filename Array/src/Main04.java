import java.util.Scanner;

public class Main04 {

    public int[] solution(int n){
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i-1]+answer[i-2];
        }
        return answer;
    }

    public static void main(String[] args) {
        Main04 T = new Main04();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 10
        for (int x : T.solution(n)){
            System.out.print(x+" ");
        }

    }
}

