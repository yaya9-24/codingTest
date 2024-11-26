import java.util.Scanner;


public class Main12 {

    public String solution(int input,String str){
        String answer = "";
        str = str.replace('#','1').replace('*','0');
        //System.out.println(str);

        //1. 나의 풀이
//        for (int i = 0; i < str.length(); i+=str.length()/input) {
//            String dstr = str.substring(i,i+7);
//            answer += (char) Integer.parseInt(dstr,2);
//        }

        for (int i=0; i<input; i++){
            String tmp = str.substring(0,7);
            answer += (char) Integer.parseInt(tmp,2);
            //Integer.parseInt()를 통해 2진수를 10진수로 변환 가능
            str= str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args){
        Main12 T = new Main12();
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt(); //4
        String str = kb.next(); // #****###**#####**#####**##**
        System.out.print(T.solution(input,str));

    }
}