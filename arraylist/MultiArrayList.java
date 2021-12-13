package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        //multidimensional arraylist
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();

        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.get(0);
        //initializations.
        // though this the array list and upto now what i was thinking is
        // it would automatically determine the size of the list.
        for (int i =0 ;i <3 ; i ++ ){
            // the below code is adding the size of the arraylist.
            arrayLists.add(new ArrayList<>());
        }

        // add the elements
        for (int row =0 ; row < 3; row++){
            for (int col =0; col < 3 ; col++){
                // i want a list at index 0.
                // the question is do you have any list at index 0.
                // here we have to get the list and then we could insert the
                // value in that list.
                arrayLists.get(row).add(scan.nextInt());
            }
        }
        System.out.println(arrayLists);


    }
}
