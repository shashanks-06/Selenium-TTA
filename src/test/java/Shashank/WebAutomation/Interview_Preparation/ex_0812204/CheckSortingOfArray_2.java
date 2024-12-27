package Shashank.WebAutomation.Interview_Preparation.ex_0812204;

//  Find if the array is sorted or not

public class CheckSortingOfArray_2 {

    public static boolean isSortedAscending(int[] array){
        for (int i = 0; i < array.length - 1 ; i++) {
            if (array[i] > array[i+1]){
                return false;    // Array is not sorted in ascending order
            }
        }
        return true;   //  Array is sorted in ascending order
    }

    public static boolean isSortedDescending(int[] array){
        for (int i = 0; i <  array.length - 1; i++) {
            if (array[i] < array[i+1]){
                return false; // Array is not sorted in descending order
            }
        }

        return true; // Array is sorted in descending order
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
        int[] arr3 = {1, 3, 2, 4, 5};

        System.out.println("Array 1 sorted in ascending? -> " + isSortedAscending(arr1));
        System.out.println("Array 1 sorted in descending? -> " + isSortedDescending(arr1));

        System.out.println("Array 2 sorted in ascending? -> " + isSortedAscending(arr2));
        System.out.println("Array 2 sorted in descending? -> " + isSortedDescending(arr2));

        System.out.println("Array 3 sorted in ascending? -> " + isSortedAscending(arr3));
        System.out.println("Array 3 sorted in descending? -> " + isSortedDescending(arr3));
    }

}
