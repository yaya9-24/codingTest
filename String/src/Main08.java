import java.util.Scanner;


public class Main08 {

    public String solution(String str){
        String answer = "NO";
        //replaceAll() 은 정규표현식 사용이 가능하다.
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equals(tmp)) return "YES";

        return answer;
    }

    public static void main(String[] args){
        Main08 T = new Main08();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine(); //found7, time: study; Yduts; emit, 7Dnuof
        System.out.print(T.solution(str));
    }
}