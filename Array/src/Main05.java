import java.util.Scanner;

public class Main05 {

    //소수 (에라토스테네스 체)
    public int solution(int n){
        int[] ch = new int[n+1];
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (ch[i]==0) {
                answer++;
                for (int j = i; j <= n; j=j+i) {
                    ch[j] =1;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main05 T = new Main05();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 20
        System.out.print(T.solution(n));

    }
}

