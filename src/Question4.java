import java.util.Scanner;

public class Question4 {
    public static void main(String[] args){

        System.out.println("好きな文字列を入力してください");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(str);

        String reverse = new StringBuilder(str).reverse().toString();

        System.out.println("逆にした文字列は" + reverse + "です！");

    }
}
