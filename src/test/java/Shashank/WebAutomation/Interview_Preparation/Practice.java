package Shashank.WebAutomation.Interview_Preparation;



public class Practice {

    public static boolean isAscending(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[ i + 1]){
                return false;
            }
        }
        return true;
    }

    public static boolean isDescending(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] < array[i + 1]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println(isAscending(array1));

        int[] array2 = {5, 4, 3, 2, 1};
        System.out.println(isDescending(array2));
    }

}
