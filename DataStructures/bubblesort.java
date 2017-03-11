package bubblesort;

import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		s.nextLine();
		
		int[] arr = new int[a];
		for(int i=0; i<a; i++){
			arr[i] = s.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		//sort array using bubble sort
		for(int i = a-1; i>=0; i--){
			System.out.println(i);
			for(int j=1; j<=i; j++){
				if(arr[j-1] > arr[j]){
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}