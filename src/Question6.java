import java.util.Scanner;

public class Question6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[] makeArr = new int[count];

        System.out.println(count + "個の要素を作成しました");

        int total = 0;
        int totalCount = 0;

        for(int i = 0; i < makeArr.length; i++){
            System.out.println((i + 1) + "番目の数字を入力してください");
            int sum = sc.nextInt();
            total += sum;
            makeArr[i] = sum;
            System.out.println(makeArr[i]);
            totalCount++;
            if(totalCount == makeArr.length){
                break;
            }
        }

        System.out.println("要素内の配列の合計は"+total+"です");




    }
}
