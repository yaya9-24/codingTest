import java.util.Arrays;
import java.util.Scanner;


public class Main09 {

    public int solution(String str){
        //1. 나의 풀이
//        int answer = 0;
//        str = str.toUpperCase().replaceAll("[A-Z]","");
//        //System.out.println(str);
//        if (str.charAt(0)=='0') str = str.substring(1);
//        answer = Integer.parseInt(str);

        //2. isDigit() 이용하기
        String answer = "";
        for (char x : str.toCharArray()){
            if (Character.isDigit(x)) answer+=x;
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args){
        Main09 T = new Main09();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); //g0en2T0s8eSoft    tge0a1h205er
        System.out.print(T.solution(str));
    }
}