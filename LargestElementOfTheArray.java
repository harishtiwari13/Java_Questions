import java.util.*;
import java.util.Arrays;
public class LargestElementOfTheArray {
    public static void tony(int[] a){
        int largest = a[0];
        for(int b = 1 ; b < a.length ; b++){
            if(a[b] > largest){
                largest = a[b];
            }
        }
        System.out.println("The Largest Element in the Array is: " + largest);
    }
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int size = j.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Array Elements: ");
        for(int t = 0 ; t < arr.length ; t++){
            arr[t] = j.nextInt();
        }
        System.out.println("The Original Array is: ");
        System.out.println(Arrays.toString(arr));
        tony(arr);
    }
}