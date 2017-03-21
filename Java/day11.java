import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class day11{

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File file = new File("input.txt");
		Scanner s = new Scanner(file);
		
		int[][] a = new int[6][6];
		
		for(int i=0; i<6; i++){
			for(int j=0; j<6; j++){
				a[i][j] = s.nextInt();
			}
		}
		
		//System.out.println(Arrays.deepToString(a));
		int maxSum = 0;
		int currSum = 0;
		
		for(int i=1; i<5; i++){
			//System.out.println(Arrays.toString(a[i]));
			for(int j=1; j<5; j++){
				//System.out.print(a[i][j]);
				if (i==1 && j==1){
					maxSum = sum(i, j, a);
					//System.out.println(maxSum);
				}else{
					currSum = sum(i, j, a);
					if(currSum > maxSum){
						maxSum = currSum;
					}
				}
			}

		}
		System.out.println(maxSum);

	}
	
	static int sum(int r, int c, int[][] arr){
		int sum = arr[r-1][c-1] + arr[r-1][c] + arr[r-1][c+1] + arr[r][c] + arr[r+1][c-1] + arr[r+1][c] + arr[r+1][c+1] ;
		return sum;
	}
	

}
