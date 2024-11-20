import java.util.Scanner;
public class Main01 {

    public int solution(String str,char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        //System.out.println(str);
        //System.out.println(t);

//        // 1번째 방법 for
//        for (int i =0; i<str.length();i++){
//            if (str.charAt(i)==t) answer++;
//        }

        // 2번째 방법 forEach
        for (char x : str.toCharArray()){
            if (x==t) answer ++;
        }
        return answer;
    }

    public static void main(String[] args){
        Main01 T = new Main01();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0); // 문자 하나 받는 방법 .charAt(0)
        System.out.print(T.solution(str,c));
    }
}