import java.util.Random;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int pcNum = random.nextInt(6) + 1;

        System.out.println("挑戦しますか？ y/n");
        char yesNo = sc.next().charAt(0);

        if(yesNo == 'y'){
            System.out.println("数字を入力してください");
            int selfInput = sc.nextInt();
            if(selfInput < 7){
                if(selfInput > pcNum){
                    System.out.println("PCの数字は"+pcNum+"のため、あなたの勝ちです");
                } else{
                    System.out.println("PCの数字は"+pcNum+"のため、あなたの負けです");
                }
            } else {
                System.out.println("無効な数字");
            }

        }




    }
}
