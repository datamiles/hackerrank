import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RotateArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int d = in.nextInt();
        int v = 0;

        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        
        for(int i=d; i<n; i++){
            System.out.print(arr[i] + " ");
            //arr2[i] = arr[i-1];            
        }
        
        for(int i=0; i<d; i++){
            System.out.print(arr[i]+ " ");
        }

        

    }

}
