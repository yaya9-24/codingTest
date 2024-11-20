import java.util.Scanner;

public class Main03 {

    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] arr = str.split(" "); // !!!!!!
        for (String x : arr){
            int len = x.length();
            if (len>m){
                m=len;
                answer=x;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main03 T = new Main03();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine(); //it is time to study
        System.out.print(T.solution(str));
    }
}