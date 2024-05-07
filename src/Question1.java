import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("秒数を入力");

        int times = sc.nextInt();

        for(int i =times; i > 0; i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("終了");
    }
}
