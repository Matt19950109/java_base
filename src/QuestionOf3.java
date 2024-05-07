import java.util.Scanner;

public class QuestionOf3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("摂氏を入力してください");

        int celsiusTemp = sc.nextInt();
        double fahrenheitTemp = (double)celsiusTemp * 9/5 + 32;

        System.out.println("摂氏"+ celsiusTemp +"°の華氏は"+ fahrenheitTemp +"℉です");
    }
}
