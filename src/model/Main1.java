package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main1 {
	
public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cases = Integer.parseInt(br.readLine());
		System.out.println();
		int c = 1;
		String line = br.readLine();
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		while(c <= cases) {
			
			line = br.readLine();
			int total = 0;
			
			while(line!=null && !line.equals("")) {
				
				if(treeMap.containsKey(line))
					treeMap.put(line, treeMap.get(line)+1);
				else {
					treeMap.put(line, 1);
				}
				total++;
				line = br.readLine();	
			}	
			
		    for (Object key : treeMap.keySet()) { 	
		    	System.out.printf("%s %.4f", key.toString(), treeMap.get(key)*100.0/total);
		    	System.out.println("");
		    }
			c++;
		}
		br.close();
	}
}
