public class MethodTest3 {
    public static void main(String[] args){
        int[] testArray = {10, 5, 8, 3, 15, 7};

        int maxValue = findMax(testArray);
        int minValue = findMin(testArray);

        System.out.println(maxValue);
        System.out.println(minValue);
    }

    public static int findMax(int[] arr){
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        return max;
    }
    public static int findMin(int[] arr){
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }

        return min;
    }
}
