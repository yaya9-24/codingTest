import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public String solution(String str){
        String answer = "";
        char[] c = str.toCharArray();
        int lt = 0, rt=str.length()-1;
        while (rt>lt){
            if (!Character.isAlphabetic(c[lt])) lt++;
            else if (!Character.isAlphabetic(c[rt])) rt--;
            else {
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
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}