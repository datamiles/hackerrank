import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		List<Integer> myList = new ArrayList<Integer>();
		int n = s.nextInt();
		s.nextLine();

		for(int i=0; i<n; i++){
			myList.add(s.nextInt());
		}
		
		//System.out.println(myList.toString());
		//System.out.println(myList.indexOf(3));
		
		s.nextLine();
		int q = s.nextInt();
		//System.out.println(q);
		
		//s.nextLine();
		for(int i=0; i<q; i++){
			String action = s.next();
			//System.out.println(action);
			
			if(action.equals("Insert")){
				//System.out.println(action);
				s.nextLine();
				int in = s.nextInt();
				int v = s.nextInt();
				//System.out.println(v);
				//myList.add(v);
				myList.add(in, v);
			}else{
				//System.out.println(action);
				int out = s.nextInt();
				myList.remove(out);
				
			}
		}
		
		//System.out.println(myList);
		s.close();
		
		for(int i=0; i<myList.size(); i++){
			System.out.print(myList.get(i) + " ");
		}
		
	}

}
