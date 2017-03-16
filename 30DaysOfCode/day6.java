package day6of30;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class day6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("input.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		String line;
		String val;
		StringBuilder evenVals = new StringBuilder();
		StringBuilder oddVals = new StringBuilder();
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
	    
	    
		
		int n = Integer.parseInt(br.readLine());
		//System.out.println(n);
		
		while ((line = br.readLine()) != null){
			//System.out.println(line);
			StringTokenizer stringTokenizer = new StringTokenizer(line);
			//System.out.println(stringTokenizer.countTokens());
			val = stringTokenizer.nextElement().toString();
			//System.out.println(val);
			
			for(int i=0; i<val.length(); i++){
				if(i%2 == 0){
					char eChar = val.charAt(i);
					//System.out.println("echar is " + eChar);
					evenVals.append(eChar);
				}else if (i%2 != 0){
					char oChar = val.charAt(i);
					oddVals.append(oChar);
				}
				
			}
			String e = evenVals + " ";
			//System.out.println("\n" + e + " ");
			writer.print(evenVals + " " + oddVals +"\n");
			//writer.println(oddVals);
			evenVals.setLength(0);
			oddVals.setLength(0);
			//System.out.print(oddVals +"\n");
		}
		
		writer.close();
		
			
				
				


	}

}
