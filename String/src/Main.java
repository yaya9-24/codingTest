
import java.util.Scanner;

public class Main {

    public String solution(int n,String str){
        String answer = "";
        str = str.replace('#','1').replace('*','0');
        //System.out.println(str);
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0,7);
            answer += (char) Integer.parseInt(tmp,2);
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 4
        String str = kb.next(); // #****###**#####**#####**##**
        System.out.print(T.solution(n,str));
    }
}