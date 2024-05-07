public class QuestionOf1 {
    public static void main(String[] args){
        double distance = 325.0;
        double capacity = 100.0;
        double fuel = 1.2;

        double fuelConsumption = capacity * fuel;
        int countTimes = 0;

        while(distance > fuelConsumption){
                distance = distance - fuelConsumption;
                countTimes++;
        }



        System.out.println("最低" + countTimes + "回給油しなければなりません");
    }

}
