package com.idocs.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BusinessLogic {
	
	private Set<String> orderedSet;
	private Set<String> firstSetOfStrings;
	private Set<String> secondSetOfStrings;
		
	public BusinessLogic() {
		super();
		this.orderedSet = new TreeSet<>();
		this.firstSetOfStrings = new HashSet<>();
		this.secondSetOfStrings = new HashSet<>();
	}

	public void compareFiles(BufferedReader br1, BufferedReader br2 ){
		String currentLine;
		try{
			while ((currentLine = br1.readLine()) != null) {
				firstSetOfStrings.add(currentLine);
			}
			while ((currentLine = br2.readLine()) != null) {
				secondSetOfStrings.add(currentLine);
			}
		} catch (IOException e){
			System.out.println("Couldn't read from files");
		}
		
		if(firstSetOfStrings.size() >= secondSetOfStrings.size()){
			
			for(String stringToCompare : firstSetOfStrings){
				if(secondSetOfStrings.contains(stringToCompare)){
					orderedSet.add(stringToCompare);
				}
			}
		}
		else{
			for(String stringToCompare : secondSetOfStrings){
				if(firstSetOfStrings.contains(stringToCompare)){
					orderedSet.add(stringToCompare);
				}
			}
		}
	}

	public Set<String> getOrderedSet() {
		return orderedSet;
	}

	public void setOrderedSet(Set<String> orderedSet) {
		this.orderedSet = orderedSet;
	}
}
