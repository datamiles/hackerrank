import java.util.*;

public class DescendingBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 2;
		arr[3] = 5;
		arr[4] = 4;
		
		System.out.println(Arrays.toString(arr));
		int len = arr.length;
		
		//sort array in descending order
		for(int i=len-1; i>=0; i--){
			for(int j=1; j<=i; j++){
				if(arr[j-1] < arr[j]){
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}