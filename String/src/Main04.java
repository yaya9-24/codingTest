import java.util.ArrayList;
import java.util.Scanner;

public class Main04 {

    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        //1.StringBuilder의 reverse() 활용
//        for (String x : str){
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
        //2. 직접 바꾸기 !!!!!!!!!!!!!!!!!!!!!!!!
        for (String x : str){
            char[] c = x.toCharArray();
            int lt = 0, rt=x.length()-1;
            while (rt>lt){
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(c);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args){
        Main04 T = new Main04();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }
        for (String x : T.solution(n,str)){
            System.out.println(x);
        }
    }
}