import java.util.Scanner;

public class MethodTest2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("三角形の底辺を入力してください");
        double bottom = sc.nextDouble();

        System.out.println("三角形の高さを入力してください");
        double height = sc.nextDouble();

        //メソッドを呼び出す
        double result = calcTriangleArea(bottom, height);

        System.out.println("三角形の面積は" + result + "です");


    }

    public static double calcTriangleArea(double bottom, double height){
        double area = (bottom * height) / 2;

        return area;
    }
}
