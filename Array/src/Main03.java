import java.util.Scanner;

public class Main03 {

    public String solution(int n,int[] arrA,int[] arrB){
        String answer = "";

        for (int i=0; i<n; i++){
            if (arrA[i]==arrB[i]) answer += "D";
            else if (arrA[i] == 1 && arrB[i] ==3) answer += "A";
            else if (arrA[i] == 2 && arrB[i] ==1) answer += "A";
            else if (arrA[i] == 3 && arrB[i] ==2) answer += "A";
            else answer += "B";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main03 T = new Main03();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 5
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = kb.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arrB[i] = kb.nextInt();
        }
        for (char x : T.solution(n, arrA,arrB).toCharArray()){
            System.out.println(x);
        }

    }
}

