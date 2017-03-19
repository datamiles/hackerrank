import java.util.*;

public class day10{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		//System.out.println(num);
		
		int[] bin = new int[8];
		int consecCount = 0;
		int max = 0;
		List<Integer> myList = new ArrayList<Integer>();
		
		while(num>0){
			int rem = num%2;
			num = num/2;
			//System.out.println("Num is "+num + " and rem is " + rem);
			myList.add(rem);
			if (rem==1){
				consecCount++;
			}else{
				consecCount =0;
			}
			
			if (consecCount>max){
				max = consecCount;
			}

		}
				
		System.out.println(max);
		
		
		
	}

}
