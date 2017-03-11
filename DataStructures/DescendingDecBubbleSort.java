import java.util.*;

public class DescendingDecBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		s.nextLine();
		
		int[] arr = new int[a+2];
		for(int i=0; i<a; i++){
			arr[i] = s.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		//sort array in descending order
        	int l = s.length;
        	for(int i=l-3; i>=0; i--){
            		for(int j=1; j<=i; j++){
                		BigDecimal num0 = new BigDecimal(s[j-1]);
                		BigDecimal num1 = new BigDecimal(s[j]);
                		if(num0.doubleValue() < num1.doubleValue()){
                    		String temp = s[j-1];
                    		s[j-1] = s[j];
                    		s[j] = temp;
                		}
            		}
        	}
		
		System.out.println(Arrays.toString(arr));

	}

}