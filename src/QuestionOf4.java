import java.util.Random;
import java.util.Scanner;

public class QuestionOf4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("文字列を入力");
        String originalMessage = sc.nextLine();

        //charの配列に変換
        char[] strArr = originalMessage.toCharArray();


        StringBuilder encodedMessage = new StringBuilder();
        for(char c: strArr){
            int randomNum = random.nextInt(9) + 1;
            encodedMessage.append(c).append(randomNum);
            
        }
        System.out.print(encodedMessage);
    }
}
