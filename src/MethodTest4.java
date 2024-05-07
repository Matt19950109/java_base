import java.util.Scanner;

public class MethodTest4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("回文を入力してください");
        String str = sc.next();


        // isPalindromeメソッドの呼び出しと結果の表示
        if(isPalindrome(str)){
            System.out.println(str+"は回文です");
        } else{
            System.out.println(str+"は回文ではないです");
        }
    }

    // isPalindromeメソッドの定義
    public static boolean isPalindrome(String str) {
        // 文字列をすべて小文字に変換しておく
        str = str.toLowerCase();

        // 文字列の前後から1文字ずつ比較していく
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // 文字が一致しない場合、回文でないと判断
            }
            left++;
            right--;
        }
        return true; // 文字がすべて一致した場合、回文であると判断
    }
}
