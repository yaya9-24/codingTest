import java.util.ArrayList;
import java.util.Scanner;

public class Main05 {

    public String solution(String str){
        String answer = "";

        char[] c = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;
        while (rt>lt){
            if (!Character.isAlphabetic(c[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(c[rt])) {
                rt--;
            }else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);
        return answer;
    }

    public static void main(String[] args){
        Main05 T = new Main05();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); //a#b!GE*T@S
        System.out.print(T.solution(str));
    }
}