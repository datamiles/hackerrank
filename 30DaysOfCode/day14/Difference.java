import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
	// Add your code here
    
	Difference(int[] a){
        	this.elements = a;
        	//System.out.println(Arrays.toString(elements));
    	}

    	void computeDifference(){
        	int max=0;
		
		for(int e=0; e<elements.length-1; e++ ){
			for(int k=1; k<elements.length; k++){
				int one = elements[e];
				int two = elements[k];
				
				//System.out.println("one " + one + " two" + two);
				int result = Math.abs(one-two);
				
				if(max< result){
					max=result;
				}
			}

		}
		
		maximumDifference = max;
    }