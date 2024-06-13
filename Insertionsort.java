public class Insertionsort {
    static void solution(int[] arr){
        //Start loop from the second element
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            //Look at previous element
            int j = i - 1;

            //while preceding elements are less than current element
            while(j >= 0 && arr[j] > key){
                //Move item to the next index since key is moving backwards
                arr[j + 1] = arr[j];
                //Move one index back
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    }

    static void reverseSolution(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] < key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args){
        int[] test = {6,2,3,4,5,10,9,8,7,6,8,3,6,5,1,4,7};
        //reverseSolution(test);
        // solution(test);
        for(int i : test){
            System.out.println(i);
        }
    }

    //Runtime O(n^2)
}