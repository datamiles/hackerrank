import java.util.LinkedList;

public class Queue {

	LinkedList<String> q;
	
	public Queue(){
		q = new LinkedList<>();
	}
	
	
	public void enqueue(String n){
		q.addLast(n);
	}
	
	public String dequeue(){
		return q.remove(0);
	}
	
	public String peek(){
		return q.get(0);
	}
	
	public void Display(){
		for(int i=0; i<q.size(); i++){
			System.out.print(q.get(i));
		}
	}
}
