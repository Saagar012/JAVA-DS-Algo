package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int arr1[][] = new int[3][3];
         for (int row = 0 ; row < arr1.length ; row ++)
         {
                 for (int col =0 ; col < arr1[row].length; col++ ){

                         arr1[row][col] = scan.nextInt();

                 }
         }
         for(int i = 0 ; i < arr1.length; i++){
                   System.out.println(Arrays.toString(arr1[i]));
         }

         // enhanced for loop
         for(int[] a : arr1){
             System.out.println(Arrays.stream(a).toArray());
        }


    }
    
}
