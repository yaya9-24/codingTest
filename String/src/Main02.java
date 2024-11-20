import java.util.*;

public class Main02 {

    public String solution(String str){
        String answer = "";

        for (char x : str.toCharArray()){
            if (Character.isUpperCase(x)){
                x = Character.toLowerCase(x);
                answer += x;
            }else{
                x = Character.toUpperCase(x);
                answer += x;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main02 T = new Main02();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); //StuDY
        System.out.print(T.solution(str));
    }
}