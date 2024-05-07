import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("一つ目の数字を入力してください");

        int num1 = sc.nextInt();

        System.out.println("2つ目の数字を入力してください");

        int num2 = sc.nextInt();

        System.out.println("演算子を選択してください(+ - * /)");

        char enzansi = sc.next().charAt(0);

        int result;

        switch (enzansi) {

            case '+':
                result = num1 + num2;
                System.out.println(result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;

            case '/':
                result = num1 / num2;
                System.out.println(result);
                break;
        }

    }
}
