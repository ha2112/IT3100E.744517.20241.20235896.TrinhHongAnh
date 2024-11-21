package Lab01;
import java.util.Arrays;
import java.util.Scanner;

public class sortArray {
    public static void main(String args[]){
        System.out.println("How many elements are there in your array?");
        Scanner keyboard = new Scanner(System.in);
        double total = 0;
        int n = keyboard.nextInt();
        System.out.println("Enter your array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = keyboard.nextInt();
            total += arr[i];
        }
        double avg = total / n;
        Arrays.sort(arr);
        System.out.println("The sorted array is " + Arrays.toString(arr));
        System.out.println("The average value of this array is " + String.valueOf(avg));
        System.exit(0);
    }
}
