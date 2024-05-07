import java.util.Scanner;

public class QuestionOf11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("年を入力してください");
        int year = sc.nextInt();

        System.out.println("月を入力してください");
        int month = sc.nextInt();

        switch (month) {
            case 1,3,5,7,8,10,12:
                System.out.println("日数は31日です");
                break;
            case 4,6,9,11:
                System.out.println("日数は30日です");
                break;
            case 2:
                if(year % 4 ==0){
                    if(!(year % 400 ==0) && year % 100==0){
                        System.out.println("日数は28日です");
                    }else{
                        System.out.println("日数は29日です");
                    }
                }else{
                    System.out.println("日数は29日です");
                }
        }
    }
}
