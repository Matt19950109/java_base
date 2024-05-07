import java.util.Scanner;

public class QuestionOf13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("数値を入力してください");
        int putMeter = sc.nextInt();

        System.out.println("単位を入力してください");
        String putString = sc.next();

        switch (putString){
            case "キロメートル":
                double convKilometer = (double)putMeter / 1000;
                System.out.println(putMeter + "mは" + convKilometer + "kmです");
                break;

            case "センチメートル":
                int convCm = putMeter * 100;
                System.out.println(putMeter + "mは" + convCm + "cmです");
                break;

            case "ミリメートル":
                int convMm = putMeter * 1000;
                System.out.println(putMeter + "mは" + convMm + "mmです");
                break;
        }
    }
}
