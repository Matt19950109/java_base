import java.util.ArrayList;
import java.util.List;

public class QuestionOf8 {
    public  static void main(String[] args){
        int[] scoresArr = new int[]{70, 85, 78, 90, 65, 80, 88, 92, 76, 84, 69, 85, 92, 73, 86, 89, 77, 85, 94, 67, 88, 79, 83, 75, 91, 80, 86, 82, 74, 93};

        List<Integer> convList = new ArrayList<>();

        //配列の値をリストに格納
        double total = 0;
        for(int i: scoresArr){
            total += i;
            convList.add(i);
        }
        System.out.println(total);
        System.out.println(convList);

        double avg = total / convList.size();
        System.out.println("平均点は"+ avg +"です");


    }
}
