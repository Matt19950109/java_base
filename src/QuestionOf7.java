import java.util.Scanner;

public class QuestionOf7 {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("名前を入力してください");
        String name = sc.next();

        System.out.println("誕生した年を入力してください");
        int age = sc.nextInt();
        String convAge = String.valueOf(age);

        String pw = name + convAge;

        System.out.println("独自に生み出したパスワードは"+ pw + "です");
    }
}
