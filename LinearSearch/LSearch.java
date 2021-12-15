package LinearSearch;
// this is a very basic searching algorithm
// start searching the element from the first index and you will find if it is present in the array.
// Time complexity : how your time is going to grow when the input is grown.
// how the time grows as your input grows.
// Best case is O(1) constant
// worst case is O(n) where n is the size of the array.
//  constant time complexity and linear time complexity


public class LSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target =90;
        System.out.println(linearSearch(arr, target));
    }
    //search in the array: return the index if the item is found.
    //other wise return -1


    public static int linearSearch(int[] arr, int target){
            if(arr.length==0){
                return -1;
            }
            //run for a loop
        for(int index =0 ; index< arr.length ; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }

}
