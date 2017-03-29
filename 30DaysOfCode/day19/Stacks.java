import java.util.Stack;

public class Stacks {

	Stack<String> s;
	
	public Stacks(){
		s = new Stack<String>();
	}
	
	public void addElement(String n){
		s.push(n);
	}
	
	public String removeElement(){
		return s.pop();
	}
	
	public void Display(){
		for(int i=0; i<s.size(); i++){
			System.out.print(s.get(i));
		}
	}
}
