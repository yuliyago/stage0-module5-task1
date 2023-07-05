package com.epam.mjc.stage0;


/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[]{"winter","spring","summer","autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i]=i+1;
        }
        return numbers;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number) return i;
        }
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] newArr=new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[arr.length-1-i]=arr[i];
        }
        return newArr;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int flag=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) flag++;
        }
        int[] newArr=new int[flag];
        int counter=0;
        for (int j : arr) {
            if (j > 0) {
                newArr[counter] = j;
                counter++;
            }
        }
        return newArr;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length-1; i++) {
            for (int j = 0; j < sortArr.length-i-1; j++) {
                if(sortArr[j+1]<sortArr[j]){
                    int swap=sortArr[j];
                    sortArr[j]=sortArr[j+1];
                    sortArr[j+1]=swap;
                }
            }
        }
    }
    public static void bubbleSortArr(int[][] sortArr){
        for (int i = 0; i < sortArr.length-1; i++) {
            for (int j = 0; j < sortArr.length-i-1; j++) {
                if(sortArr[j+1].length<sortArr[j].length){
                    int []swap=sortArr[j];
                    sortArr[j]=sortArr[j+1];
                    sortArr[j+1]=swap;
                }
            }
        }
    }
    public static int[][] sortRaggedArray(int[][] arr) {
        int len=arr.length;
       int [][]newArr=new int[len][];
        for (int i = 0; i < len; i++) {
            bubbleSort(arr[i]);
        }
//        //sorting first subarray
//        bubbleSort(arr[0]);
//        //sorting second subarray
//        bubbleSort(arr[1]);
       //sorting subarrays by their length
        bubbleSortArr(arr);
//       if(arr[0].length>arr[1].length){
//           newArr[0]=arr[1];
//           newArr[1]=arr[0];
//       }
//       else{
//           newArr[0]=arr[0];
//           newArr[1]=arr[1];
//       }
       return arr;
    }

    public static void main(String[] args) {
        int[][]array=new int[2][];
        array[0]=new int[]{9,8,7};
        array[1]=new int[]{3,12};
        array=sortRaggedArray(array);
        for(int i=0;i<2;i++){
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(array.length);

    }
}
