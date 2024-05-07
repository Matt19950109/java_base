import java.util.Scanner;

public class MethodTest1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("メールアドレスを入力してください");
        String address = sc.next();

        System.out.println("件名を入力してください");
        String title = sc.next();

        email(address, title);
    }

    public static void email(String address, String title){
        System.out.println("メールアドレス：" + address);
        System.out.println("件名：" + title);
    }
}
