public class Mergesort{
    static void mergeSort(int[] arr, int p, int r){
        if(p < r){
            int q = (p + r) / 2;
            mergeSort(arr, p, q);
            mergeSort(arr, q + 1, r);
            merge(arr, p, q, r);
        }
    }


    static void merge(int[] arr, int p, int q, int r){
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i = 0; i < n1; i++){
            left[i] = arr[i + p];
        }

        for(int i = 0; i < n2; i++){
            right[i] = arr[q + i + 1];
        }

        int i = 0;
        int j = 0;
        int k = p;
        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }

    }

    static void printArray(int[] arr){
        System.out.println("Array length is " + arr.length);
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        int[] test = {6,2,3,4,5,10,9,8,7,6,8,3,6,5,1,4,7};
        mergeSort(test, 0, test.length - 1);
        printArray(test);
    }

    //runtime 0(nlogn)
}