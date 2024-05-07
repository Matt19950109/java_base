import java.util.Scanner;

public class QuestionOf10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("天気を入力してください");
        String weather = sc.next();

        switch (weather) {
            case "晴れ":
                System.out.println("晴れ：Tシャツ");
                break;
            case "曇り":
                System.out.println("曇り：セーター");
                break;
            case "雨":
                System.out.println("雨：レインコート");
                break;
        }
    }
}
