import java.util.Random;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int pcInputNum = random.nextInt(10) + 1;
        System.out.println(pcInputNum);
        System.out.println("数当てゲームです1～10までの数字を入力してください");

        for(int times = 3; times > 0; times--){
            System.out.println("チャンスはあと"+times+"回です");
            int selfInputNum = sc.nextInt();
            if(selfInputNum < 11){
                //数当てゲームの処理
                if(pcInputNum > selfInputNum){
                    System.out.println("正解の数は" + selfInputNum + "より大きいです");
                } else if(pcInputNum < selfInputNum){
                    System.out.println("正解の数は" + selfInputNum + "より小さいです");
                } else{
                    System.out.println("正解です！プログラムを終了します");
                    break;
                }

            } else{
                System.out.println("無効な数字なのでゲーム終了します");
                break;
            }
        }


    }
}
