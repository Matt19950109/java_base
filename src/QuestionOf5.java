import java.util.Scanner;

public class QuestionOf5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("犬の年齢を入力");
        int dogAge = sc.nextInt();

        int humanAge = dogAge * 7;

        System.out.println("人間に換算すると" + humanAge + "歳です！");
    }
}
