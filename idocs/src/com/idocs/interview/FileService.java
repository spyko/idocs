package com.idocs.interview;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

public class FileService {
	
	public static BufferedReader openFileForReading(String path){
		BufferedReader bufferedReader = null;
		try {
			FileReader fileReader = new FileReader(path);
			bufferedReader = new BufferedReader(fileReader);
		} catch (FileNotFoundException e) {
			System.out.println("No such a file: " + path );
			e.printStackTrace();
		}
		return bufferedReader;
	}
	
	public static BufferedWriter openFileForWriting(String path){
		BufferedWriter bufferedWriter = null;
		try{
			FileWriter fileWriter = new FileWriter(path);
			bufferedWriter =  new BufferedWriter(fileWriter);
		} catch (IOException e) {
			System.out.println("Error occured opening file for writing: " + path );
			e.printStackTrace();
		}
		
		return  bufferedWriter;
		
	}

	public static void writeToFileFromSet(BufferedWriter bufferedWriter,
			Set<String> orderedSet) {
		for(String string: orderedSet){
			try {
				bufferedWriter.write(string + "\n");
			} catch (IOException e) {
				System.out.println("Error occured writing file");
				e.printStackTrace();
			}
		}
		
	}
	
	public static void closeFiles(BufferedReader br1, BufferedReader br2, BufferedWriter bw){
		try {
			br1.close();
			br2.close();
			bw.close();
		} catch (IOException e) {
			System.out.println("Error occured closing files");
			e.printStackTrace();
		}
	
		
	}
	
}
