package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import datastructures.HashTable;

public class Main2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cases = Integer.parseInt(br.readLine());
		System.out.println();
		int c = 1;
		String line = br.readLine();
		ArrayList<String> keys = new ArrayList<>();
		
		while(c <= cases) {
			
			HashTable<String, String> hashTable = new HashTable<>();
			line = br.readLine();
			
			while(line!=null && !line.equals("")) {
				hashTable.insert(line, line);
				keys.add(line);
				line = br.readLine();	
			}	
			
			TreeSet<String> treeSet = new TreeSet<String>(keys);
			
		    for (String key : treeSet) { 	
		    	System.out.printf("%s %.4f", hashTable.get(key), Collections.frequency(keys, key)*100.0/hashTable.getSize());
		    	System.out.println("");
		    }
		    
		    keys.clear();
			c++;
		}
		br.close();
	}
}
