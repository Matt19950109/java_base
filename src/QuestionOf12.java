import java.util.Scanner;

public class QuestionOf12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("パスワードを入力してください");

        String pw = sc.next();

        boolean pwCount = false;
        boolean hasNumber = false;
        boolean hasUppercase = false;

        if(pw.length() >= 8){
            System.out.println("文字数問題なし");
            pwCount = true;
        } else{
            System.out.println("文字数が少ないです");
        }

        char[] charArr = pw.toCharArray();

        for(char c: charArr){
            if(Character.isDigit(c)){
                hasNumber = true;
            }

            if(Character.isUpperCase(c)){
                hasUppercase = true;
            }
        }

        if(pwCount && hasNumber && hasUppercase){
            System.out.println("登録完了");
        }else {
            System.out.println("パスワード登録が失敗しています");
        }

    }
}
