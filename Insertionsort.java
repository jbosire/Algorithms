public class Insertionsort {
    static void solution(int[] arr){
        //Start loop from the second element
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            //Look at previous element
            int j = i - 1;

            //while preceding elements are less than current element
            while(j > 0 && arr[j] > key){
                //Move item to the next index since key is moving backwards
                arr[j + 1] = arr[j];
                //Move one index back
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args){
        int[] test = {1,3,5,2,3,6,7};
        solution(test);
        
        for(int i : test){
            System.out.println(i);
        }
    }

    //Runtime O(n^2)
}