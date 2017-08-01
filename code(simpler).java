import java.util.*;
import java.io.*;
import java.math.*;

/**
This one is easier from the amount of code perspective. I simply used Arrays.sort() method 
to get the similar results as with quicksort.
 **/
class Solution {
    
    
    //Swap method.
    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
        
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        
        //initializing array of size N
        int[] horses = new int[N];
        
        /*initializing diff vairable which will be the one with the final difference between horses.
        Since I'm trying to find minimums, I saw now harm starting it with a large number.*/
        int diff = Integer.MAX_VALUE;
        
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            horses[i] = pi;
        }
        
        //Sorting the array with the built-in sorting method.
        Arrays.sort(horses);
        
        
        //compare each horse to the next.
        for(int i = 0; i < N - 1; i++){
            int absolute = Math.abs(horses[i] - horses[i + 1]);
                if(absolute < diff){
                    diff = absolute;
            }
        }
        
        //print minimum difference between horses.
        System.out.println(diff);
    }
}
