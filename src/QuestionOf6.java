import java.time.LocalDate;
import java.util.Scanner;

public class QuestionOf6 {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("誕生した年を入力してください");
        String inputYear = sc.next();
        int nowYear = LocalDate.now().getYear();
        int convInt = Integer.parseInt(inputYear);

        int ageCalc = nowYear - convInt;

        System.out.println("あなたは現在"+ ageCalc +"歳ですよね？");
    }
}
