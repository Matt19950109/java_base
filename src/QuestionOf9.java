import java.util.Scanner;

public class QuestionOf9 {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("点数を入力してください");
        int score = sc.nextInt();

        if(score <=100){
            if (score > 89) {
                System.out.println("Aランク");
            } else if (score > 79) {
                System.out.println("Bランク");
            } else if (score > 69) {
                System.out.println("Cランク");
            } else if (score > 59) {
                System.out.println("Dランク");
            } else {
                System.out.println("Fランク");
            }
        } else{
            System.out.println("無効な値です");
        }
    }
}
