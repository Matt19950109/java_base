import java.util.Scanner;

public class QuestionOf2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("評価を入力してください(1~10)");
        int userINput = sc.nextInt();

        if(userINput < 4){
            System.out.println("Cグレードの映画");
        } else if(userINput < 8) {
            System.out.println("Bグレードの映画");
        } else if(userINput < 11){
            System.out.println("Aグレードの映画");
        } else{
            System.out.println("無効な値です");
        }
    }
}
