import java.util.Scanner;


public class Main07 {

    public String solution(String str){
        //1. 직접 비교하기
//        String answer = "YES";
//        int len = str.length();
//        str = str.toUpperCase();
//        for (int i = 0; i < len/2; i++) {
//            if (str.charAt(i)!=str.charAt(len-i-1)) return "NO";
//        }

        //2. StringBuilder 사용하기
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        //equalsIgnoreCase() : 대소문자 상관없이 비교
        if (tmp.equalsIgnoreCase(str)) answer = "YES";


        return answer;
    }

    public static void main(String[] args){
        Main07 T = new Main07();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); //gooG
        System.out.print(T.solution(str));
    }
}