import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Palindrome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Queue q = new Queue();
		Stacks s = new Stacks();
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		
		String word = br.readLine();
		System.out.println(word.length());
		
		for(int i=0; i<word.length(); i++){
			String c = Character.toString(word.charAt(i));
			q.enqueue(c);
			s.addElement(c);
			
		}
		
		q.Display();
		System.out.println("");
		s.Display();
	
		
		boolean p = false;
		for(int i=0; i<word.length(); i++){
			String el = q.dequeue();
			String sl = s.removeElement();
			if(!el.equals(sl)){
				System.out.println("q.dequeue() != s.removeElement()" + el + sl);
				System.out.println("Word is not palindrome");
				break;
			}else{
				p = true;
			}
		}
		
		if(p){
			System.out.println("Word is a plaindrome");
		}
		
	}

}
