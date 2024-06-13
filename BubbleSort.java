public class BubbleSort{
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = arr.length - 1; j > i; j--){
                if (arr[j] < arr[j - 1]){
                    int acc = arr[j -  1];
                    arr[j - 1] = arr[j];
                    arr[j] = acc;
                }
            }
        }
    }

    static boolean sorted(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = arr[i - 1];
            if (curr < prev){
                return false;
            }
        }

        return true;
    }

    static void printArray(int[] arr){
        boolean sorted = sorted(arr);
        System.out.println(sorted ? "Array is good" : "Array is bad");
        System.out.println("Array length is " + arr.length);
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        int[] test = {6,2,3,4,5,10,9,8,7,6,8,3,6,5,1,4,7};
        bubbleSort(test);
        printArray(test);
    }
}