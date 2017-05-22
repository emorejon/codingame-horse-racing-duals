import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {
    
    //QuickSort method.
    public static void quickSort(int[] arr, int left, int right){
        
        int index = partition(arr, left, right);
        
        if(left <  index - 1){
            quickSort(arr, left, index - 1);
        }
        
        if(index < right){
            quickSort(arr, index, right);
        }
    }
    
    //partition method
    public static int partition(int[] arr, int left, int right){
        
        int pivot = arr[(left+right)/2];
        
        while(left <= right){
            
            while(arr[left] < pivot)
            left++;
            
            while(arr[right] > pivot)
            right--;
            
            if(left <= right){
                
                swap(arr, left, right);
                
                left++;
                right--;
            }
        }
        return left;
    }
    
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
        int diff = 999999;
        
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            horses[i] = pi;
        }
        
        
        //initializing pointers and pivot points for sorting algortihm.
        int leftPointer = 0;
        int rightPointer = N - 1;
        int pivot = horses[N/2];
        
        //sort array
        quickSort(horses, leftPointer, rightPointer);
        
        
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
